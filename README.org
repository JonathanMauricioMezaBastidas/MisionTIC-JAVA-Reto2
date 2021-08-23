* Reto #2 - MisionTIC JAVA
** Descripción
Para el congreso nacional de computación se necesita un software que
registre todos los participantes.

Principalmente los asistentes que han pagado el ticket y los
conferencistas. Se debe registrar: =nombre=, =apellido=, =documento=,
=especialidad=, =empresa=. Para los conferencistas debe registrar la
=horaCharla= y para los asistentes el =nro_ticket=.

Utilice la especificación del siguiente diagrama de clases para este
reto:
[[https://i.ibb.co/1mYJgj5/image.png]]

** A tener en cuenta
En la clase Congreso, se debe definir la función procesar comandos que
realiza las siguientes operaciones:
*** Agregar participantes: Opción 1
Se puede añadir un conferencista con el siguiente comando:
#+BEGIN_SRC
1;Conferencista;nombre;especialidad;documento;empresa;horaCharla
#+END_SRC

*Ejemplo:*
#+BEGIN_SRC
1;Conferencista;Carlos Perez;Machine Learning;34442222;Google Inc;1400
#+END_SRC

Se puede añadir un asistente con el siguiente comando:

#+BEGIN_SRC
1;Asistente;nombre;especialidad;documento;empresa;nroTicket
#+END_SRc

*Ejemplo:*
#+BEGIN_SRC
1;Asistente;Pepito Perez;Estudiante;334221111;Universidad Nacional;5545878
#+END_SRC

*** Listar ítems del inventario: Opción 2
Se debe mostrar la frase "=*** Participantes Congreso ***=" seguida
por los participantes en el orden en el que fueron agregados.

Si se trata de un conferencista se mostrará así: Recuerde que =\t=
implica correr el ítem unos espacios a la derecha:

#+BEGIN_SRC
\tConferencista - Nombre: Carlos Perez
\tEspecialidad: Machine Learning
\tDocumento: 34442222
\tEmpresa: Google Inc
\tHora Charla: 1400
#+END_SRc

Si se trata de un asistente se mostrará así:

#+BEGIN_SRC
\tAsistente - Nombre: Pepito Perez
\tEspecialidad: Estudiante
\tDocumento: 334221111
\tEmpresa: Universidad Nacional
\tNo. ticket: 5545878
#+END_SRC

*** Salir: Opción 3.
** Detalles
*Nota 1:* Observe que el único comando que tiene salida es el listar.

*Nota 2:* En este ejercicios se requiere subir cuatro archivos.

- Uno corresponde a la clase Participante llamado *Participante.java*
- otro corresponde a la clase Conferencista llamado *Conferencista.java*
- otro corresponde a la clase Asistente llamado *Asistente.java*
- otro corresponde a la clase Congreso llamado *Congreso.java*
- Se debe eliminar la línea de =package= al hacer el envío y utilizar
  el botón =[+]= para agregar más archivos de código fuente.

** Entrada Ejemplo
#+BEGIN_SRC
1;Asistente;Andres Perez;Management;9620643;Unal;138954
1;Conferencista;Carlos Perez;Machine Learning;3811783;Microsoft;887
1;Asistente;Ana Bustos;Machine Learning;5975654;Google Inc.;132161
1;Asistente;Camila Ramirez;Sistemas Distribuidos;1013325;Microsoft;142516
2
3
#+END_SRC
** Salida Ejemplo
#+BEGIN_SRC
\*** Participates Congreso ***
	Asistente - Nombre: Andres Perez
	Especialidad: Management
	Documento: 9620643
	Empresa: Unal
	No ticket: 138954

	Conferencista - Nombre: Carlos Perez
	Especialidad: Machine Learning
	Documento: 3811783
	Empresa: Microsoft
	Hora charla: 887

	Asistente - Nombre: Ana Bustos
	Especialidad: Machine Learning
	Documento: 5975654
	Empresa: Google Inc.
	No ticket: 132161

	Asistente - Nombre: Camila Ramirez
	Especialidad: Sistemas Distribuidos
	Documento: 1013325
	Empresa: Microsoft
	No ticket: 142516
#+END_SRC