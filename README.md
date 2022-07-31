# Data-Structures
Implementing the data structures using java

<h2>Arrays<hr></h2>
<p>
  <ul>
	<li>Arrays are The Simplest data structure we used it to store list of numbers, String, Object ; literally anything<br></li> 
  <li>This item get stored sequentially in memory<br></li>
  <li>If we need to stored item and Lookup by using their index arrays are the optimal data structure<br></li>
  </ul>
  <img src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2015/05/Arrays.png" alt="Array">
  <h3>Downside of the array</h3>
  <p> In the Most language like java, C++ arrays are static, when we allocate the array specific their size and this size cannot be change in later on time. Therefore, we need to know how many items we need to stored in array before initializing the array</p> 
  <p>If we don't know we would guess the size of the array, guess is larger than the amount of the stored item in array resources ate wasted, guess is to small we need to allocate new bigger array and copy to the small array element to the newly added array this operation is costly</p>
  <h3>Runtime Complexity of the Various Operation in Array</h3>
  <ol>
  <li>Lookup (By using index) : O(1) </li>
  <li>Inserting element (If array is full) : O(n) </li>
  <li>Removing element (Begining of the array) : O(n)</li>
</ol>
</p>

## Linkde list<hr>
We used the Linked list to stored data in sequential order but unlike array Linked list can grow and shrink automatically. Linked list consist group of node sequence each node hold two pieces of data ;
- Value
- Address of the next node in to the list 

Each node reference the next node that's why we refer the structure as linked list because these nodes are link together
we call first node as head and last node as tail.
Nodes are the link list are can be all over the memory they may not be exactly next after each other that's why we each node need to keep reference next to each node
<img src="https://media.geeksforgeeks.org/wp-content/cdn-uploads/gq/2013/03/Linkedlist.png" alt="Linked list">

|  |At the Begin   |At the middle |At the end   
| ------------ | ------------ | ------------ | ------------
| Lookup  |   |   |   |
| Run time complexity  |   |   | O(n)|
| Insert  |Create a new node and link it in to the next node & head pointed to the new node   |Firstly we have to find the relevant node that is a O(n) Operation(Trevers the list) and then insert new node and reference it   | Simply create a new node & Tails is pointed to the new node. We should reference to the last node in somewhere, so we can not traverse the list every time  |  
|  Run time complexity  |O(1)   |O(n)   |  O(1)| 
|Delete  | Simply set the previous head to the next node now. We should remove the link from the previous head so it doesn't reference the second node any more we shouldn't to do that javas' garbage collector assume that is used object therefore it will not be removed by the garbage collector  | Find the before node that we removed node, we treverse the list and find node and node before relevant node we should link previous node and node after node and remove link the node|  Find the node that before last node and tail is pointed to that node and reference set to be a null. If we find to the before last node we should traverse the list. |    
| Run time complexity  |O(1)   |O(n)   | O(n)| | 


