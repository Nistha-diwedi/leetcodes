/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */
struct ListNode* addTwoNumbers(struct ListNode* l1, struct ListNode* l2) {
    struct ListNode *p1 = l1, *p2 = l2;
    struct ListNode *head = NULL, *p3 = NULL;
    int sum = 0;

    while(p1 || p2 || sum){
        if(p1){
            sum += p1->val;
            p1 = p1->next;
        }
        if(p2){
            sum += p2->val;
            p2 = p2->next;
        }
        struct ListNode *new = malloc(sizeof(struct ListNode));
        new->val = sum%10;
        sum = sum/10;
        if(head){
            p3->next = new;
            p3 = new;
        }
        else{
            head = p3 = new;
        }
    }
    p3->next = NULL;
    return head;
}
