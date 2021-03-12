

# iterative methode
def reverse_iterative(a, start, end):
    while start < end:
        a[start], a[end] = a[end], a[start]
        start += 1;
        end -= 1;

# recursive approach
def reverse_recursive(a, start, end):
    # base case
    if start >= end:
        return
    #swap numbers
    a[start], a[end] = a[end], a[start]
    reverse_recursive(a, start+1, end-1)

# reverse using list-slicing approach
def list_slicing_methode(a):
    return a[::-1]

a = [1,2,3,4,5,6];

# iterative approach
print("--------iterative approach---------")
print("before reversal: ", a)
reverse_iterative(a, 0, len(a)-1)
print("after reversal : ", a)

print("\n--------recursive approach---------")
# recursive approach
print("before reversal: ", a)
reverse_recursive(a, 0, len(a)-1)
print("after reversal : ", a)

print("\n--------reverse using List slicing---------")
print("before reversal: ", a)
arr = list_slicing_methode(a);
print("after reversal : ", arr)