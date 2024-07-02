from collections import namedtuple

Student = namedtuple('Student', ['name', 'reg', 'mark1', 'mark2', 'mark3', 'avg'])

def calculate_average(m1, m2, m3):
    return (m1 + m2 + m3) / 3

num = int(input("Enter number of students: "))
students = []

for _ in range(num):
    n = input("Enter Name: ")
    r = input("Enter Reg: ")
    m1 = float(input("Enter M1: "))
    m2 = float(input("Enter M2: "))
    m3 = float(input("Enter M3: "))
    avg = calculate_average(m1, m2, m3)
    student = Student(n, r, m1, m2, m3, avg)
    students.append(student)

for student in students:
    print(f"Name: {student.name}, Reg: {student.reg}, Mark1: {student.mark1}, Mark2: {student.mark2}, Mark3: {student.mark3}, Avg: {student.avg:.2f}")

sorted_students = sorted(students, key=lambda student: student.avg, reverse=True)
for rank, student in enumerate(sorted_students, start=1):
    print(f"Rank {rank}: Name: {student.name}, Reg: {student.reg}, Avg: {student.avg:.2f}")

