 class Solution {
        public ListNode rotateRight(ListNode head, int k) {
                if(head == null || head.next == null)
                            return head;
                                        
                                                // Count Number of nodes in List
                                                        int n = NoOfNodes(head);

                                                                // We will wrap around k so that it always remain less than n
                                                                        k = k % n;

                                                                                // If no rotation is required
                                                                                        if(k == 0)
                                                                                                    return head;

                                                                                                            int count = 0;
                                                                                                                    int req = n - k;    // req -> Required starting nodes of original list that will be added in the last of our answer 
                                                                                                                            ListNode temp = head;
                                                                                                                                    
                                                                                                                                            // Will traverse start nodes 
                                                                                                                                                    while(count < req-1)
                                                                                                                                                            {
                                                                                                                                                                        temp = temp.next;
                                                                                                                                                                                    count++;
                                                                                                                                                                                            }

                                                                                                                                                                                                    if(temp == null)
                                                                                                                                                                                                                return head;

                                                                                                                                                                                                                        // Store next node in 'next' which will be the head of our answer
                                                                                                                                                                                                                                ListNode next = temp.next;
                                                                                                                                                                                                                                        // To end the answer list, make sure to make the next of temp as null
                                                                                                                                                                                                                                                temp.next = null;
                                                                                                                                                                                                                                                        
                                                                                                                                                                                                                                                                // Now traverse remaining list
                                                                                                                                                                                                                                                                        temp = next;
                                                                                                                                                                                                                                                                                while(temp.next != null)
                                                                                                                                                                                                                                                                                            temp = temp.next;

                                                                                                                                                                                                                                                                                                    // And attach the end of list to head
                                                                                                                                                                                                                                                                                                            temp.next = head;

                                                                                                                                                                                                                                                                                                                    return next;
                                                                                                                                                                                                                                                                                                                        }

                                                                                                                                                                                                                                                                                                                            public int NoOfNodes(ListNode head)
                                                                                                                                                                                                                                                                                                                                {
                                                                                                                                                                                                                                                                                                                                        int c = 0;
                                                                                                                                                                                                                                                                                                                                                ListNode temp = head;

                                                                                                                                                                                                                                                                                                                                                        while(temp != null)
                                                                                                                                                                                                                                                                                                                                                                {
                                                                                                                                                                                                                                                                                                                                                                            c++;
                                                                                                                                                                                                                                                                                                                                                                                        temp = temp.next;
                                                                                                                                                                                                                                                                                                                                                                                                }

                                                                                                                                                                                                                                                                                                                                                                                                        return c;
                                                                                                                                                                                                                                                                                                                                                                                                            }
                                                                                                                                                                                                                                                                                                                                                                                                            } // req -> Required starting nodes of original list that will 
                                                                                                                                                                                                                                                                                                                                                                                                       

                                                                                                                                                                                                                                                                                                                                                                                                                 
// Will t
         