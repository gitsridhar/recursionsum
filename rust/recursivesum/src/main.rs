/// Recursively calculates the sum of all non-negative integers less than a given number `n`.
///
/// # Arguments
/// * `n` - The number up to which to sum (exclusive).
///
/// # Returns
/// The sum of all non-negative integers less than `n`.
fn recursive_sum_less_than(n: u32) -> u32 {
    // The base case: if n is 0, the sum is 0.
    if n == 0 {
        0
    } else {
        // The recursive step: add (n - 1) to the sum of all numbers less than (n - 1).
        (n - 1) + recursive_sum_less_than(n - 1)
    }
}

fn main() {
    let limit = 10;
    let total = recursive_sum_less_than(limit);

    println!("The sum of all numbers less than {} is: {}", limit, total);
    
    // Example of the calculation: 0 + 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 = 45
}

// Another way to think about the problem using tail recursion (though Rust doesn't guarantee
// tail call optimization, this is a common recursive pattern):

/// Helper function to perform the summation with an accumulator.
fn recursive_sum_tail_recursive_helper(n: u32, accumulator: u32) -> u32 {
    if n == 0 {
        accumulator
    } else {
        // The accumulator builds the sum as the recursion "unwinds" conceptually.
        recursive_sum_tail_recursive_helper(n - 1, accumulator + (n - 1))
    }
}

/// A public interface for the tail-recursive approach.
#[allow(dead_code)] // Added to prevent an "unused function" warning for the second example
fn recursive_sum_tail_recursive(n: u32) -> u32 {
    recursive_sum_tail_recursive_helper(n, 0)
}

