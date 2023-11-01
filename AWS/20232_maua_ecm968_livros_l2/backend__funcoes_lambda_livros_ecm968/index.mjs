//sdk aws versão 3 (mais recente)
import inserir_livros from './inserir_livros.mjs';
import get_livros from './get_livros.mjs';
import get_item_livros from './get_item_livros.mjs'
import delete_livros from './delete_livros.mjs';
import put_livros from './put_livros.mjs';
import { DynamoDBClient } from '@aws-sdk/client-dynamodb';
import { DynamoDBDocumentClient } from '@aws-sdk/lib-dynamodb';

const client = new DynamoDBClient({});
const docClient = DynamoDBDocumentClient.from(client);
const tableName = '20232_maua_ecm967_lab2_livros';
const funcoes = {
    "POST": ({docClient, tableName, payload, id}) =>
        inserir_livros(docClient, tableName, payload, context.awsRequestId),
    "GET": ({docClient, tableName, id}) => id ?
         get_item_livros(docClient, tableName, id) : get_livros(docClient, tableName),
    "DELETE": ({docClient, tableName, id}) =>
        delete_livros(docClient, tableName, id),
    "PUT": ({docClient, tableName, id}) =>
        put_livros(docClient, tableName, id)

};

export const handler = async (event, context) => {
  const {method, payload, id} = event;
  try{
    return funcoes[method]({docClient, tableName, payload, id});
  }
  catch (e){
    console.log(event);
    return event;
  }
};