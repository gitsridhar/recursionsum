import Foundation

// Recursive function to calculate the sum of numbers from 1 up to 'n'
func sumNumbersRecursive(n: Int) -> Int {
    // Base case: if n is 0 or less, the sum is 0
    if n <= 0 {
        return 0
    }
    // Recursive case: n + the sum of all numbers less than n
    else {
        return n + sumNumbersRecursive(n: n - 1)
    }
}

// Example usage:
let limitNumber = 5
let result = sumNumbersRecursive(n: limitNumber)

print("The numbers to be summed are from 1 up to and including \(limitNumber).")
print("The recursive sum of all numbers less than or equal to \(limitNumber) is: \(result)")

// Output will be 1 + 2 + 3 + 4 + 5 = 15
