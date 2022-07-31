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
