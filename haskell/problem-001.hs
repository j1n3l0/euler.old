-- file: problem-001.hs

-- If we list all the natural numbers below 10 that are multiples
-- of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
-- Find the sum of all the multiples of 3 or 5 below 1000.
-- See http://projecteuler.net/index.php?section=problems&id=1

-- euler problem 001
sumDivisibleBy n = n * ( p * ( p + 1) ) `div` 2
    where
        p      = target `div` n
        target = 999

problem_001 = sumDivisibleBy 3 + sumDivisibleBy 5 - sumDivisibleBy 15
