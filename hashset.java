// Time Complexity : O(1)
// Space Complexity : O(N) -- that is 10^6 because that is the max case
// Did this code successfully run on Leetcode : yes
// Any problem you faced while coding this : this is working fine but the storage problem is there.
// The above solution is a simple and direct solution.

// This solution is 10^6 * 1 byte for every boolean value.



int size = 1000001;
	boolean[] flag;
    public MyHashSet() {
		flag = new boolean[size];
	}
    
    public void add(int key) {
        flag[key]=true;
    }
    
    public void remove(int key) {
        flag[key]=false;
    }
    
    public boolean contains(int key) {
        return flag[key];
    }
