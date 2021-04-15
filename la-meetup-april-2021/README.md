## Minimum Steps to a Palindrome

Sourced from https://edabit.com/challenge/zadc59oCm9Hj5xnrh


## Description
Given an incomplete palindrome as a string, return the minimum letters needed to be added on to the end to make the string a palindrome.

## Examples

```
minPalindromeSteps("race") ➞ 3
// Add 3 letters: "car" to make "racecar"

minPalindromeSteps("mada") ➞ 1
// Add 1 letter: "m" to make "madam"

minPalindromeSteps("mirror") ➞ 3
// Add 3 letters: "rim" to make "mirrorrim"
```

## Notes
Trivially, words which are already palindromes should return 0.


## Commands

Run REPL
```
clojure -A:repl
```

Run tests once:
```
clojure -A:test
```

Run tests continuously:
```
clojure -A:test --watch
```

