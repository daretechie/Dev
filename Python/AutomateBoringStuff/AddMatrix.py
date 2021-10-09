R = int(input("Enter the number of rows:"))
C = int(input("Enter column number"))

matrix = []
print("start from the row")

for i in range(R):
    a = []
    for j in range(C):
        a.append(int(input()))
    matrix.append(a)

for i in range(R):
    for j in range(C):
        print(matrix[i][j], end=" ")
    print()

result = [[0, 0, 0],
          [0, 0, 0],
          [0, 0, 0]]
for i in range(len(R)):
    for j in range(len(R[0])):
        result[i][j] = R[i][j] + C[i][j]

for r in result:
    print(r)
