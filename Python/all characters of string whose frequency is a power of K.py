# Python code for the above approach
import math

# Function to count the frequency
# of every alphabet in the string
# and print the alphabets with
# frequency as the power of K
def countFrequency(str, N, K):

	# Map will store the frequency
	# of each alphabet of the string
	freq = {}

	# Store the frequency of each
	# alphabet of the string
	for i in range(N):
		if str[i] in freq.keys():
			freq[str[i]] = freq[str[i]] + 1
		else:
			freq[str[i]] = 1

	# Traverse the Map
	for i in sorted(freq.keys()):

		# Calculate log of the
		# current string alphabet
		lg = math.floor(math.log2(freq[i]))

		# Power of 2 of the log value
		a = math.pow(2, lg)

		if a == freq[i]:
			while a != 0:
				print(i)
				a = a - 1

# Driver Code
str = "aaacbb"

# Size of string
N = len(str)

# Initialize K
K = 2

# Function call
countFrequency(str, N, K)

