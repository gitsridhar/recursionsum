def add_sequence_recursive(n):
    """
    Calculates the sum of all positive integers from 1 up to and including 'n'
    using recursion.

    Args:
        n (int): The upper limit of the sequence. Must be a positive integer.

    Returns:
        int: The sum of the numbers in the sequence.
    """
    if n <= 0:
        # Base case: if n is 0 or negative, the sum is 0
        return 0
    else:
        # Recursive step: add n to the sum of all numbers less than n
        return n + add_sequence_recursive(n - 1)

# Example Usage:
number = 5
sum_result = add_sequence_recursive(number)

print(f"The number provided is: {number}")
print(f"The sequence added (1 + 2 + 3 + 4 + 5) is: {sum_result}")

# Another example:
number_two = 10
sum_result_two = add_sequence_recursive(number_two)
print(f"\nThe sum of numbers less than or equal to {number_two} is: {sum_result_two}")
