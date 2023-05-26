#source	"examen1.xana"

' Global variables

' Invocation to the main function
call main
halt


#line 1

f:
' Parameters
' a :: int (offset 8)
' b :: double (offset 4)
' Local variables
enter	0

#line 2

' Return statement
push	bp
pushi	8
addi
loadi
pushi	1
addi
i2f
ret	4, 0, 6

#line 5

main:
' Parameters
' Local variables
' real :: double (offset -4)
' integer :: int (offset -6)
enter	6

#line 9

' Assignment statement
push	bp
pushi	-6
addi
pushb	97
b2i
storei

#line 10

' Assignment statement
push	bp
pushi	-4
addi
push	bp
pushi	-6
addi
loadi
i2f
storef

#line 12

' Write statement
push	bp
pushi	-4
addi
loadf
pushi	1
i2f
addf
outf

#line 12

' Write statement
pushb	32
outb

#line 12

' Write statement
pushb	97
b2i
push	bp
pushi	-6
addi
loadi
subi
outi

#line 12

' Write statement
pushb	32
outb

#line 12

' Write statement
push	bp
pushi	-4
addi
loadf
pushb	97
b2i
i2f
divf
outf

#line 12

' Write statement
pushb	32
outb

#line 12

' Write statement
pushb	97
b2i
pushb	98
b2i
muli
outi

#line 12

' Write statement
pushb	10
outb

#line 14

' Write statement
' Comparisson operation
pushb	97
b2i
pushb	97
b2i
eqi
outi

#line 14

' Write statement
pushb	32
outb

#line 14

' Write statement
' Comparisson operation
pushb	97
b2i
push	bp
pushi	-6
addi
loadi
gei
outi

#line 14

' Write statement
pushb	32
outb

#line 14

' Write statement
' Comparisson operation
push	bp
pushi	-6
addi
loadi
i2f
push	bp
pushi	-4
addi
loadf
ltf
outi

#line 14

' Write statement
pushb	32
outb

#line 14

' Write statement
' Comparisson operation
pushb	97
b2i
i2f
push	bp
pushi	-4
addi
loadf
pushi	1
i2f
addf
nef
outi

#line 16

' Write statement

#line 16

' Function invocation (expression)
push	bp
pushi	-6
addi
loadi
pushb	99
b2i
i2f
call f
outf
ret	0, 6, 0
