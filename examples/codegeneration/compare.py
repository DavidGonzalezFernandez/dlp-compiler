def limpia_lista(lista):
    lista = [l.strip() for l in lista]
    lista = [l for l in lista if len(l) > 0]
    lista = [l for l in lista if not l.startswith("#")]
    lista = [l for l in lista if not l.startswith("'")]
    lista = [l.replace("\t", " ").replace("  ", " ") for l in lista]

    return lista

f1_name = "big_input.xana.mp"
f2_name = "big_input_copy.xana.mp"

with open(f1_name, "r") as f:
    lineas_1 = f.readlines()

with open(f2_name, "r") as f:
    lineas_2 = f.readlines()

lineas_1 = limpia_lista(lineas_1)
lineas_2 = limpia_lista(lineas_2)

assert len(lineas_1) == len(lineas_2), "no tienen misma len"

for (i,(l1, l2)) in enumerate(zip(lineas_1, lineas_2)):
    if l1!=l2:
        print(i)
        print("BIEN:", l1)
        print("YO:", l2)
        print()

print("FIN")