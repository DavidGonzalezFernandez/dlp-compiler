# source	"examples/codegeneration/prueba_tonta.xana"

' Global variables

' Invocation to the main function
call main
halt


# line 1

main:
' Parameters
' Local variables
' a :: int (offset -2)
enter	2

# line 4

' Assignment statement
push	bp
pushi	-2
addi
' Comparisson operation
pushf	2.0
pushf	2.5
lef
storei
ret	0, 2, 0
