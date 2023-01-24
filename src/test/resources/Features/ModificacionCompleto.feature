# language: es

@ModificaiconCompleto

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

    #Añadir Requerimiento

    Dado dar clic en requerimiento
    Cuando seleccionar solicitarModificacion
    Entonces dar clic en el botón "Modificacion"

    Dado filtra "numero requerimiento" "3"
    Cuando selecciona y se "Anadir" requerimiento
    Entonces se agrega solicitud agregamos una justificacion "prueba"

    Dado subir archivo
    Cuando dar clic en el botón "guardarModifi"
    Entonces dar clic en el botón "aceptar"

    Dado Se filtras "estado" "En Modificación" "codigo proyecto" "7750"
    Cuando dar clic en el botón "solicitud modificacion"
    Entonces dar clic en el botón "editar"

    Dado agregar numero requerimiento "3" y dependencia "000200"
    Cuando  agregar mes inicio "Febrero", mes oferta "Marzo" y mes inicio contrato "Julio"
    Entonces agregar la duracion del contrato mes "9" dias "20"

    Dado agregar modalidad de seleccion "CCE-04" y actuacion contractual "Adici"
    Cuando agrega Numero de contrato "1"
    #Cuando se agrega tipo de contrato "Arrendamiento" y perfil "1B"
    #Entonces se agrega valor honorario "13920502" y cantidad de contratos "1"

    Dado agregar descripcion "ashdhsadasdhsadsahdgas"
    Cuando  agregar mes "Febrero" y vigencia de los recursos "2023"
    Entonces agregar auxiliar "71" y detalle fuente "007"

    Dado agregar actividad "1.1", MGA "1901120" y POSPRE "O2310101001"
    Cuando agregar codigo UNSPSC "41105502"
    Entonces visualiza la sesion aprobacion inicial

    Dado dar clic en el botón "guardar"
    Cuando dar clic en el botón "enviar"
    Entonces dar clic en el botón "aceptar"

    Dado cerrar sesion
    Cuando ingresa las credenciales email "userwapi03@saludcapital.gov.co" y contrasena "112233"
    Entonces podra dirigirse a la pantalla "Modificaciones solicitadas"

    Dado Se filtras "estado" "En Revisi" "codigo proyecto" "7750"
    Cuando dar clic en el botón "solicitud modificacion"
    Entonces dar clic en el botón "editar"

    Dado Revisiones
    Cuando agregamos area "Planeación" y conceptos "Duracion estimada"
    Entonces se agrega la observacion "asdasdasdsadsad"

    Dado agregar checks
    Cuando dar clic en el botón "reservado"
    Entonces dar clic en el botón "aceptar"

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




