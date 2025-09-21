/*
Create a program with a logic that throws the ArraylndexOutOfBoundsException while accessing elements in an array. Hint: (Use array and loop and try to access the element beyond the last index)

*/
public class ArrayException {

	public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5}; // Array of size 5

        try {
            for (int i = 0; i <= numbers.length; i++) { // Intentional off-by-one error
                System.out.println("Element at index " + i + ": " + numbers[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array out of Bound Exception");
        }

        
    }

}

/*
output :
Element at index 0: 1
Element at index 1: 2
Element at index 2: 3
Element at index 3: 4
Element at index 4: 5
Error: Array out of Bound Exception
*/