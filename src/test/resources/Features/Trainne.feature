# language: es
@Wapi
Característica: Usuario podra agregar o modificar requerimientos

  Antecedentes:

  @RolReferente_PAA
  Escenario: usuario agrega o modifica requerimiento

    #Login

    Dado el usuario ingresa a la plataforma
    Cuando  ingresa las credenciales email "userwapi01@saludcapital.gov.co" y contrasena "112233"
    Entonces  se visualiza el inicio

    #Tabla PAA

    Dado podra dirigirse a la pantalla "PAA"
    #Cuando ordenar filtro por desendente
    Entonces Se filtra "codigo proyecto" "7835"

    #Resumen requerimiento

    Dado se filtra se selecciona y da clic en resumen
    Cuando regresamos al PAA
    Entonces Se filtra "codigo proyecto" "7835"

    Dado se filtra se selecciona
    Cuando dar clic en requerimiento
    Entonces Se filtra "numero requerimiento" "601"

    #Requerimiento

    Dado seleccionar propiedades requerimiento
    Cuando regresamos requerimiento
    Entonces seleccionar solicitarModificacion

    #Solicitud modificacion

    Dado se visualiza la pantalla solicitarModificacion
    Cuando Abrir pop up requerimiento
    Entonces Se filtra "numero requerimiento" "601"

    #Añadir requerimiento

    Dado selecciona y se "Anadir" requerimiento
    Cuando se debe visualizar el requerimiento añadido
    Entonces crear una solicitud nueva

    #Propiedades requerimeinto

    Dado agregar numero requerimiento "606" y dependencia "000100"
    Cuando  agregar mes inicio "Enero", mes oferta "Febrero" y mes inicio contrato "Marzo"
    Entonces agregar la duracion del contrato mes "12" dias "29"

    Dado agregar modalidad de seleccion "CCE-02" y actuacion contractual "Inicial"
    #Cuando agrega Numero de contrato ""
    Cuando se agrega tipo de contrato "Arrendamiento" y perfil "1A"
    Entonces se agrega valor honorario "14338118" y cantidad de contratos "1"

    Dado agregar descripcion "ashdhsadasdhsadsahdgas"
    Cuando  agregar mes "Enero" y vigencia de los recursos "2022"
    Entonces agregar auxiliar "84" y detalle fuente "007"

    Dado agregar actividad "1.1", MGA "1901127" y POSPRE "O2310101001"
    Cuando agregar codigo UNSPSC "12141903"
    Entonces visualiza la sesion aprobacion inicial

    Dado dar clic en el botón "guardar"
    Cuando se agrega solicitud agregamos una justificacion "prueba"
    Entonces dar clic en el botón "enviar"


    #Bandeja tarea

    Dado podra dirigirse a la pantalla "Bandeja tareas"
    Cuando Se filtra "numero requerimiento" "601"
    Entonces  dar clic en el botón "propiedades"

    #Modificacion solicitada

    Dado  dar clic en el botón "cancelar"
    Cuando podra dirigirse a la pantalla "Modificaciones solicitadas"
    Entonces Se filtra "N solicitud" "3"

    Dado dar clic en el botón "solicitud modificacion"

    #Contrapartida

    Dado Seleccionar el boton contrapartida
    Cuando agregamos una fuente de recursos "SGP"
    Entonces agregamos descripcion "hola"

    Dado  agregamos valor aumenta "14338432" y valor que disminuye "1000000"
    Cuando seleccionaremos el boton "anadir contra"
    Entonces seleccionaremos el boton "Resume"

    #Resumen Modificacion

    Dado agregamos una fuente de recursos "SGP"
    Cuando seleccionaremos el boton "regresar"
    Entonces dar clic en el botón "cancelarModi"
