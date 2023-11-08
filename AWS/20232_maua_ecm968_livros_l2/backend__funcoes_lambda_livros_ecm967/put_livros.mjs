import {
    ScanCommand
} from '@aws-sdk/lib-dynamodb';

export default async (docClient, tableName, id) => {
    const command = new ScanCommand({
        TableName: tableName,
        Key: {
            LivroID: id
        }
    });
    const response = await docClient.send(command);
    return `user id: ${id} changed successfully and the response is ${response}`;
};