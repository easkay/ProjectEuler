start = Time.now
@@largest = 0
def check_palindrome(number)
	original = number.to_s
	if(original == original.reverse)
		if(number > @@largest)
			@@largest = number
		end
		return true
	end
	return false
end

i = 999
begin
	j = 990
	while j > 900
		j -= 1
		test_number = i * j
		check_palindrome(test_number) unless test_number < @@largest
	end
	i -= 1
end while i > 900#!check_palindrome(test_number)
puts @@largest
puts (Time.now - start)*1000