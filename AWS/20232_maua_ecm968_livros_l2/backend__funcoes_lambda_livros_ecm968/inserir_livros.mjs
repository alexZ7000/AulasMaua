import {
    PutCommand,
} from '@aws-sdk/lib-dynamodb';

export default async (docClient, tableName, livro, id) => {
    const command = new PutCommand({
        TableName: tableName,
        Item: {livro: livro, LivroID: id}
    });
    const response = await docClient.send(command);
    return {livro: livro, LivroID: id};
};