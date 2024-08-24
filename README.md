# Puzzles-IsSubsequence

Determine if a given string is a sub-sequence of another string.

## Notes from the lesson task video

Suppose you are given these values.

```
s ==>> abc
t ==>> ahgbc
```
The values of `s` are in the values in `t`.

Therefore the solution returns `TRUE`.

The lesson task suggests to use two indices `i` and `j`.

Index `j` is going through `s`.

Index `i` is going through `t`.

When the values at `i` and `j` match, then the solution can move both of the indices one position.

When the values at `i` and `j` do not match, then the solution does not want to move `j`,
and the solution only moves index `i` one position.

The stop condition is when `j` is equal the length of s minus 1.
