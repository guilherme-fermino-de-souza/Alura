# indexing = acessing elements of a sequence using [] (indexing operator)
#   [Start : end : step]

credit_number = "1234-5678-9012-3456"

last_digits = credit_number[-4:]
print(f"XXXX-XXXX-XXXX-{last_digits}")

print(credit_number)
credit_number = credit_number[::-1]
print(credit_number)
