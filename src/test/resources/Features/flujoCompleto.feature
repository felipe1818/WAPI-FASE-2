# language: es

@FlujoCompleto

Característica: Usuario podra agregar o modificar requerimientos
Antecedentes:

Escenario: usuario agrega o modifica requerimient

#Login

Dado el usuario ingresa a la plataforma
Cuando  ingresa las credenciales email "userwapi01@saludcapital.gov.co" y contrasena "112233"
Entonces  se visualiza el inicio

Dado podra dirigirse a la pantalla "PAA"
Cuando Se filtra "codigo proyecto" "7750"
Entonces se filtra se selecciona

#Requerimiento

Dado dar clic en requerimiento
Cuando seleccionar solicitarModificacion
Entonces crear una solicitud nueva

#Propiedades requerimeinto

Dado agregar numero requerimiento "9" y dependencia "000100"
Cuando  agregar mes inicio "Enero", mes oferta "Enero" y mes inicio contrato "Marzo"
Entonces agregar la duracion del contrato mes "12" dias "20"

Dado agregar modalidad de seleccion "CCE-02" y actuacion contractual "Inicial"
#Cuando agrega Numero de contrato ""
Cuando se agrega tipo de contrato "Arrendamiento" y perfil "1B"
Entonces se agrega valor honorario "13920502" y cantidad de contratos "1"

Dado agregar descripcion "ashdhsadasdhsadsahdgas"
Cuando  agregar mes "Enero" y vigencia de los recursos "2022"
Entonces agregar auxiliar "1" y detalle fuente "012"

Dado agregar actividad "1.1", MGA "1901120" y POSPRE "O2310101001"
Cuando agregar codigo UNSPSC "46181500"
Entonces visualiza la sesion aprobacion inicial

Dado dar clic en el botón "guardar"
Cuando se agrega solicitud agregamos una justificacion "prueba"
Entonces subir archivo

Dado dar clic en el botón "aceptar"

Dado dar clic en el botón "guardarModifi"
Dado dar clic en el botón "aceptar"
Cuando Se filtras "estado" "En Modificación" "codigo proyecto" "7750"
Entonces dar clic en el botón "solicitud modificacion"

Dado dar clic en el botón "enviar"
Dado dar clic en el botón "aceptar"
Cuando cerrar sesion
Entonces ingresa las credenciales email "userwapi03@saludcapital.gov.co" y contrasena "112233"

#Modificacion solicitada

Dado podra dirigirse a la pantalla "Modificaciones solicitadas"
Cuando Se filtras "estado" "En Revisi" "codigo proyecto" "7750"
Entonces dar clic en el botón "solicitud modificacion"


#Primera revision

#Dado dar clic en el botón "editar"
#Cuando Revisiones
#Entonces agregamos area "Contrataciones" y conceptos "Duracion estimada"

#Dado se agrega la observacion "asdasdasdsadsad"
#Cuando agregar checks
#Entonces dar clic en el botón "reservado"

#Segunda revision

#Dado dar clic en el botón "aceptar"
#Cuando dar clic en el botón "editar"
#Entonces Revisiones

#Dado agregamos area "Talento Humano" y conceptos "Duracion estimada"
#Cuando se agrega la observacion "asdasdasdsadsad"
#Entonces agregar checks

#Dado dar clic en el botón "reservado"
#Cuando dar clic en el botón "aceptar"
#Entonces dar clic en el botón "editar"

#Tercera revision

#Dado Revisiones
#Cuando agregamos area "Financiera" y conceptos "Duracion estimada"
#Entonces se agrega la observacion "asdasdasdsadsad"

#Dado agregar checks
#Cuando dar clic en el botón "reservado"
#Entonces dar clic en el botón "aceptar"

#Cuarta revision

Cuando dar clic en el botón "editar"
Entonces Revisiones

Dado agregamos area "Planeación" y conceptos "Duracion estimada"
Cuando se agrega la observacion "asdasdasdsadsad"
Entonces agregar checks

Dado dar clic en el botón "reservado"
Cuando dar clic en el botón "aceptar"
Entonces dar clic en el botón "cancelarModi"

Dado cerrar sesion
Cuando ingresa las credenciales email "userwapi02@saludcapital.gov.co" y contrasena "112233"
Entonces podra dirigirse a la pantalla "Modificaciones solicitadas"

Dado Se filtras "estado" "En Revisi" "codigo proyecto" "7750"
Cuando dar clic en el botón "solicitud modificacion"
Entonces dar clic en el botón "editar"

Dado dar clic en el botón "cancelar"
Cuando dar clic en el botón "enviar revisiones"
Entonces ingresar un comentario para la revision "Prueba"

Dado dar clic en el botón "aproba"
Cuando dar clic en el botón "aceptar"
Entonces dirigirse a la pantalla "PAA"

#Aprobar tramite

Dado Se filtra "codigo proyecto" "7750"
Cuando dar clic en el botón "aprobar"


