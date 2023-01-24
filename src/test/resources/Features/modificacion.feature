# language: es
@Modificacion
Característica: Usuario podra agregar o modificar requerimientos
  Antecedentes:
  Escenario: Revisar multiples modificaciones

    #Modificacion solicitada

    Dado el usuario ingresa a la plataforma

    Dado ingresa las credenciales email "userwapi03@saludcapital.gov.co" y contrasena "112233"
    Cuando podra dirigirse a la pantalla "Modificaciones solicitadas"
    Entonces Se filtras "estado" "En Revisi" "codigo proyecto" "7835"

    Dado dar clic en el botón "solicitud modificacion"
    Cuando Se filtra "numero requerimiento" "402"
    Entonces dar clic en el botón "editar"

    #Primera revision

    Dado Revisiones
    Dado agregamos area "Contrataciones" y conceptos "Duracion estimada"
    Cuando se agrega la observacion "asdasdasdsadsad"
    Entonces agregar checks

    Dado dar clic en el botón "reservado"
    Cuando  dar clic en el botón "aceptar"

    #Segunda revision

    #Dado dar clic en el botón "solicitud modificacion"
    Cuando Se filtra "numero requerimiento" "402"
    Entonces dar clic en el botón "editar"

    Dado Revisiones
    Cuando agregamos area "Talento Humano" y conceptos "Duracion estimada"
    Entonces se agrega la observacion "asdasdasdsadsad"

    Dado agregar checks
    Cuando dar clic en el botón "reservado"
    Entonces dar clic en el botón "aceptar"

    #Tercera revision

    #Dado dar clic en el botón "solicitud modificacion"
    Cuando Se filtra "numero requerimiento" "402"
    Entonces dar clic en el botón "editar"

    Dado Revisiones
    Cuando agregamos area "Financiera" y conceptos "Duracion estimada"
    Entonces se agrega la observacion "asdasdasdsadsad"

    Dado agregar checks
    Cuando dar clic en el botón "reservado"
    Entonces dar clic en el botón "aceptar"

    #Cuarta revision

    #Dado dar clic en el botón "solicitud modificacion"
    Cuando Se filtra "numero requerimiento" "402"
    Entonces dar clic en el botón "editar"

    Dado Revisiones
    Cuando agregamos area "Planeación" y conceptos "Duracion estimada"
    Entonces se agrega la observacion "asdasdasdsadsad"

    Dado agregar checks
    Cuando dar clic en el botón "reservado"
    Entonces dar clic en el botón "aceptar"

    #Dado dar clic en el botón "cancelarModi"
    Cuando cerrar sesion