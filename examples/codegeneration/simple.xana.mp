
#source	"simple.xana"

	' c :: char (offset 0)
	' a :: int (offset 1)
	' r :: double (offset 3)

' Invocation to the main function
call main
halt


#line	5

main:
	' Parameters
	' Local variables
	' a :: int (offset -2)
	' i :: int (offset -4)
	enter	4

#line	8
	pusha	0
	pushb	97
	storeb

#line	9
	' Write
	pusha	0
	loadb
	outb
	' Write
	pushb	10
	outb

#line	11
	push	bp
	pushi	-2
	addi
	pushi	1
	storei

#line	12
	push	bp
	pushi	-4
	addi
	pushb	48
	b2i
	pushi	3
	muli
	storei

#line	13
	' Write
	push	bp
	pushi	-2
	addi
	loadi
	outi
	' Write
	pushb	32
	outb
	' Write
	push	bp
	pushi	-4
	addi
	loadi
	outi
	' Write
	pushb	10
	outb

#line	15
	' Read
	pusha	3
	inf
	storef

#line	16
	' Write
	pushi	2
	i2f
	pusha	3
	loadf
	mulf
	outf
	' Write
	pushb	10
	outb

#line	18
	' Write
	pushi	3
	i2f
	pushf	4.5
	subf
	outf
	' Write
	pushb	32
	outb
	' Write
	pushb	48
	b2i
	i2f
	pushf	48.0
	divf
	outf
	' Write
	pushb	32
	outb
	' Write
	pushb	48
	b2i
	pushb	49
	b2i
	modi
	outi
	' Write
	pushb	32
	outb
	' Write
	pushb	48
	b2i
	pushb	49
	b2i
	addi
	outi
	' Write
	pushb	10
	outb

#line	20
	' Write
	pushi	1
	pushi	2
	lti
	outi
	' Write
	pushb	32
	outb
	' Write
	pushi	4
	pushi	3
	gei
	outi
	' Write
	pushb	32
	outb
	' Write
	pushi	5
	pushi	5
	eqi
	outi
	' Write
	pushb	32
	outb
	' Write
	pushi	1
	pushi	2
	and
	outi
	' Write
	pushb	32
	outb
	' Write
	pushi	0
	pushi	3
	or
	outi
	' Write
	pushb	32
	outb
	' Write
	pushi	0
	not
	outi
	' Write
	pushb	10
	outb
	ret	0, 4, 0
