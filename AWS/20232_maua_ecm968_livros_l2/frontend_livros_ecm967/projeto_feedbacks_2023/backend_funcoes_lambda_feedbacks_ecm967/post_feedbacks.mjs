import {
    PutCommand,
} from '@aws-sdk/lib-dynamodb';

export default async (docClient, tableName, feedbacks, id) => {
    const command = new PutCommand({
        TableName: tableName,
        Item: {feedbacks: feedbacks, LivroID: id}
    });
    const response = await docClient.send(command);
    return {feedbacks: feedbacks, FeedbacksID: id};
};