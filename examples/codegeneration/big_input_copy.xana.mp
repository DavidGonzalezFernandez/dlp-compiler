# source	"examples/codegeneration/big_input_copy.xana"

' Global variables
' pair :: record((integer x int) x (character x char)) (offset 0)
' acme :: [2 :: record((employees x [2 :: record((age x int))]))] (offset 3)
' fibonacci :: [8 :: [3 :: int]] (offset 11)

' Invocation to the main function
call main
halt


# line 16

p:
' Parameters
' Local variables
enter	0
ret	0, 0, 0

# line 19

f:
' Parameters
' r :: double (offset 6)
' e :: int (offset 4)
' Local variables
' real :: double (offset -4)
' c :: char (offset -5)
' result :: int (offset -7)
enter	7

# line 23

' Assignment statement
push	bp
pushi	-4
addi
push	bp
pushi	6
addi
loadf
pushf	10.0
mulf
storef

# line 24

' Assignment statement
push	bp
pushi	-5
addi
pushb	48
storeb

# line 25

' If statement
' Condition
' Comparisson operation
push	bp
pushi	4
addi
loadi
pushi	256
lti
jz	label0
' If branch body

# line 26

' Assignment statement
push	bp
pushi	-5
addi
push	bp
pushi	4
addi
loadi
i2b
storeb

# line 27

' Assignment statement
push	bp
pushi	-7
addi
push	bp
pushi	-5
addi
loadb
b2i
storei
jmp	label1
label0:
' Else branch body

# line 29

' Assignment statement
push	bp
pushi	-7
addi
push	bp
pushi	-4
addi
loadf
f2i
storei
label1:

# line 31

' Return statement
push	bp
pushi	-7
addi
loadi
ret	2, 7, 6

# line 34

initialize:
' Parameters
' Local variables
' i :: int (offset -2)
enter	2

# line 36

' Assignment statement
pusha	11
pushi	0
pushi	6
muli
addi
pushi	0
pushi	2
muli
addi
pushi	0
storei

# line 37

' Assignment statement
pusha	11
pushi	0
pushi	6
muli
addi
pushi	1
pushi	2
muli
addi
pushi	1
storei

# line 38

' Assignment statement
pusha	11
pushi	0
pushi	6
muli
addi
pushi	2
pushi	2
muli
addi
pushi	1
storei

# line 39

' Assignment statement
push	bp
pushi	-2
addi
pushi	1
storei

# line 40

' While statement
label2:
' Condition
' Comparisson operation
push	bp
pushi	-2
addi
loadi
pushi	8
lti
jz	label3
' While body

# line 41

' Assignment statement
pusha	11
push	bp
pushi	-2
addi
loadi
pushi	6
muli
addi
pushi	0
pushi	2
muli
addi
' Array indexing
pusha	11
push	bp
pushi	-2
addi
loadi
pushi	1
subi
pushi	6
muli
addi
pushi	1
pushi	2
muli
addi
loadi
storei

# line 42

' Assignment statement
pusha	11
push	bp
pushi	-2
addi
loadi
pushi	6
muli
addi
pushi	1
pushi	2
muli
addi
' Array indexing
pusha	11
push	bp
pushi	-2
addi
loadi
pushi	1
subi
pushi	6
muli
addi
pushi	2
pushi	2
muli
addi
loadi
storei

# line 43

' Assignment statement
pusha	11
push	bp
pushi	-2
addi
loadi
pushi	6
muli
addi
pushi	2
pushi	2
muli
addi
' Array indexing
pusha	11
push	bp
pushi	-2
addi
loadi
pushi	6
muli
addi
pushi	0
pushi	2
muli
addi
loadi
' Array indexing
pusha	11
push	bp
pushi	-2
addi
loadi
pushi	6
muli
addi
pushi	1
pushi	2
muli
addi
loadi
addi
storei

# line 44

' Assignment statement
push	bp
pushi	-2
addi
push	bp
pushi	-2
addi
loadi
pushi	1
addi
storei
jmp	label2
label3:
ret	0, 2, 0

# line 50

main:
' Parameters
' Local variables
' i :: int (offset -2)
' j :: int (offset -4)
enter	4

# line 52

' Function invocation (statement)
call p

# line 53

' Assignment statement
push	bp
pushi	-2
addi
pushi	0
storei

# line 54

' Assignment statement
pusha	0
pushi	2
addi
pushb	48
storeb

# line 55

' Assignment statement
pusha	0
pushi	0
addi
pushb	48
b2i
storei

# line 58

' Write statement

# line 58

' Function invocation (expression)
push	bp
pushi	-2
addi
loadi
i2f
' Field access
pusha	0
pushi	2
addi
loadb
b2i
call f
outi

# line 58

' Write statement
pushb	10
outb

# line 59

' Function invocation (statement)
pushf	1.3
pushi	2
call f
popi

# line 61

' Function invocation (statement)
call initialize

# line 62

' Assignment statement
push	bp
pushi	-2
addi
pushi	0
storei

# line 63

' While statement
label4:
' Condition
' Comparisson operation
push	bp
pushi	-2
addi
loadi
pushi	8
lti
jz	label5
' While body

# line 65

' Write statement
pushb	40
outb

# line 65

' Write statement
push	bp
pushi	-2
addi
loadi
pushi	1
addi
outi

# line 65

' Write statement
pushb	41
outb

# line 65

' Write statement
' Array indexing
pusha	11
push	bp
pushi	-2
addi
loadi
pushi	6
muli
addi
pushi	0
pushi	2
muli
addi
loadi
outi

# line 65

' Write statement
pushb	43
outb

# line 65

' Write statement
' Array indexing
pusha	11
push	bp
pushi	-2
addi
loadi
pushi	6
muli
addi
pushi	1
pushi	2
muli
addi
loadi
outi

# line 65

' Write statement
pushb	61
outb

# line 65

' Write statement
' Array indexing
pusha	11
push	bp
pushi	-2
addi
loadi
pushi	6
muli
addi
pushi	2
pushi	2
muli
addi
loadi
outi

# line 65

' Write statement
pushb	10
outb

# line 66

' Assignment statement
push	bp
pushi	-2
addi
push	bp
pushi	-2
addi
loadi
pushi	1
addi
storei
jmp	label4
label5:

# line 69

' Assignment statement
pusha	3
pushi	1
pushi	4
muli
addi
pushi	0
addi
pushi	1
pushi	2
muli
addi
pushi	0
addi
pushi	56
storei

# line 71

' Write statement
' Field access
pusha	3
pushi	1
pushi	4
muli
addi
pushi	0
addi
pushi	1
pushi	2
muli
addi
pushi	0
addi
loadi
outi

# line 71

' Write statement
pushb	10
outb

# line 72

' Assignment statement
push	bp
pushi	-2
addi
pushi	0
storei

# line 73

' While statement
label6:
' Condition
' Comparisson operation
push	bp
pushi	-2
addi
loadi
pushi	2
lti
jz	label7
' While body

# line 74

' Assignment statement
push	bp
pushi	-4
addi
pushi	0
storei

# line 75

' While statement
label8:
' Condition
' Comparisson operation
push	bp
pushi	-4
addi
loadi
pushi	2
lti
jz	label9
' While body

# line 76

' Assignment statement
pusha	3
push	bp
pushi	-2
addi
loadi
pushi	4
muli
addi
pushi	0
addi
push	bp
pushi	-4
addi
loadi
pushi	2
muli
addi
pushi	0
addi
push	bp
pushi	-2
addi
loadi
push	bp
pushi	-4
addi
loadi
addi
storei

# line 77

' Assignment statement
push	bp
pushi	-4
addi
push	bp
pushi	-4
addi
loadi
pushi	1
addi
storei
jmp	label8
label9:

# line 79

' Assignment statement
push	bp
pushi	-2
addi
push	bp
pushi	-2
addi
loadi
pushi	1
addi
storei
jmp	label6
label7:

# line 82

' Assignment statement
push	bp
pushi	-2
addi
pushi	0
storei

# line 83

' While statement
label10:
' Condition
' Comparisson operation
push	bp
pushi	-2
addi
loadi
pushi	2
lti
jz	label11
' While body

# line 84

' Assignment statement
push	bp
pushi	-4
addi
pushi	0
storei

# line 85

' While statement
label12:
' Condition
' Comparisson operation
push	bp
pushi	-4
addi
loadi
pushi	2
lti
jz	label13
' While body

# line 87

' Write statement
' Field access
pusha	3
push	bp
pushi	-2
addi
loadi
pushi	4
muli
addi
pushi	0
addi
push	bp
pushi	-4
addi
loadi
pushi	2
muli
addi
pushi	0
addi
loadi
outi

# line 87

' Write statement
pushb	32
outb

# line 88

' Assignment statement
push	bp
pushi	-4
addi
push	bp
pushi	-4
addi
loadi
pushi	1
addi
storei
jmp	label12
label13:

# line 90

' Assignment statement
push	bp
pushi	-2
addi
push	bp
pushi	-2
addi
loadi
pushi	1
addi
storei
jmp	label10
label11:
ret	0, 4, 0
