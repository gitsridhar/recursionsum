package main

import "fmt"

// addSequence recursively calculates the sum of all positive integers
// less than or equal to n.
func addSequence(n int) int {
	// Base case: If n is 0 or less, the sum is 0.
	if n <= 0 {
		return 0
	}
	// Recursive step: Return the current number plus the sum of all
	// numbers less than it.
	return n + addSequence(n-1)
}

func main() {
	number := 5
	// Call the recursive function from main
	result := addSequence(number - 1) // Calculate the sum of numbers LESS THAN the input

	fmt.Printf("The sequence of all numbers less than %d is 0 + 1 + 2 + ... + %d\n", number, number-1)
	fmt.Printf("The sum of this sequence is: %d\n", result)

	// Example with a different number
	number2 := 10
	result2 := addSequence(number2 - 1)
	fmt.Printf("\nThe sequence of all numbers less than %d is 0 + 1 + 2 + ... + %d\n", number2, number2-1)
	fmt.Printf("The sum of this sequence is: %d\n", result2)
}
