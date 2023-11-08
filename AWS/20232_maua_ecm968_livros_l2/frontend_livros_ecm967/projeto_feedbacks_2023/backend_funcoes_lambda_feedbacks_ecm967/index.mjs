//sdk aws versão 3 (mais recente)
import get_feedbacks from './get_feedbacks.mjs';
import post_feedbacks from './post_feedbacks.mjs'
import { DynamoDBClient } from '@aws-sdk/client-dynamodb';
import { DynamoDBDocumentClient } from '@aws-sdk/lib-dynamodb';

const client = new DynamoDBClient({});
const docClient = DynamoDBDocumentClient.from(client);
const tableName = 'projeto-feedbacks';
const funcoes = {
    "GET": ({docClient, tableName, id}) => id ?
        get_feedbacks(docClient, tableName, id) : 'error',
    "POST": ({docClient, tableName, payload, id}) =>
        post_feedbacks({docClient, tableName, payload, id})
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
};//sdk aws versão 3 (mais recente)
import get_feedbacks from './get_feedbacks.mjs';
import post_feedbacks from './post_feedbacks.mjs'
import { DynamoDBClient } from '@aws-sdk/client-dynamodb';
import { DynamoDBDocumentClient } from '@aws-sdk/lib-dynamodb';

const client = new DynamoDBClient({});
const docClient = DynamoDBDocumentClient.from(client);
const tableName = 'projeto-feedbacks';
const funcoes = {
    "GET": ({docClient, tableName, id}) => id ?
        get_feedbacks(docClient, tableName, id) : 'error',
    "POST": ({docClient, tableName, payload, id}) =>
        post_feedbacks({docClient, tableName, payload, id})
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