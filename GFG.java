// Java Program to print the given pattern
import java.util.*;

class GFG 
{ 
static void print_asterisk(int asterisk)
{
	if (asterisk == 0)
		return;
	System.out.print("* ");
	print_asterisk(asterisk - 1);
}

static void print_space(int space)
{
	if (space == 0)
		return;
	System.out.print(" ");
	System.out.print(" ");
	print_space(space - 1);
}

// function to print the upper-half of the pattern
static void pattern_upper(int n, int num)
{
	// base case
	if (n == 0)
		return;
	print_asterisk(n);
	print_space(2 * (num - n) + 1);
	print_asterisk(n);
	System.out.print("\n");

	// recursively calling pattern_upper()
	pattern_upper(n - 1, num);
}

// function to print the lower-half of the pattern
static void pattern_lower(int n, int num)
{
	// base case
	if (n == 0)
		return;
	print_asterisk(num - n + 1);
	print_space(2 * n - 1);
	print_asterisk(num - n + 1);
	System.out.print("\n");

	// recursively calling pattern_lower()
	pattern_lower(n - 1, num);
}

// function to print the pattern
static void pattern(int n, int num)
{
	pattern_upper(n, num);
	pattern_lower(n - 1, num);
}

// driver function
public static void main(String[] args)
{
	int n = 5;
	pattern(n, n); 
}
}

// This code is contributed by 29AjayKumar