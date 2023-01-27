# language: es
@Wapi
Característica: El usuario crea y añade CDPs/RPs

  Antecedentes:

  @CrearRequerimiento
  Escenario: El usuario crea un requerimiento

    #Login Referente PAA

    Dado el usuario ingresa a la plataforma
    Cuando Ingresar usuario "userwapi01@saludcapital.gov.co" y  contraseña "112233"
    Entonces Ingresamos a la pantalla "PAA"

    #Seleccionar proyecto

    Dado filtramos codigo del proyecto "7835"
    Cuando seleccionamos proyecto
    Entonces seleccionar "Soliciar modificacion"

    #Crear requerimiento

    Dado seleccionar "Nuevo"
    Cuando agregamos Numero de requerimiento "202" y dependencia destino "000000"
    Entonces agregar fecha estiamdo inicio "Enero", mes estiamdo presentacion "Febrero" y mes inicio ejecucion "Junio"

    Dado ingresar la duracion estimada del contrato Mes "11" Dias "9"
    Cuando ingresar modalidad seleccion "CCE-02" y actuacion contractual "Adici"
    Entonces ingresar tipo contrato "Nombre por defecto" perfil "Profesional Especializado_1B" valor Honorario "14000000"

    Dado ingresar contidad contratos "1" y descripcion "Prueba"
    Cuando ingresa mes "Febrero" fecha recursos "2022" y auxuliar "175"
    Entonces agregar detalle fuente "7" y actividad "1.6"

    Dado seleccionar "Anadir"
    Cuando editamos cadena presupuestal
    Entonces agregar un valor "10000000"

    Dado seleccionar "Aceptar"
    Cuando agregar codigo UNSPSC "46171500"
    Entonces seleccionar "Anadi"

    Dado seleccionar "Guardar"
    Cuando seleccionar "Aceptar"
    Entonces agregar justificacion "Prueba"

    Dado adjuntar archivo pdf
    Cuando seleccionar "Guardar"
    Entonces seleccionar "Aceptar"

    Dado ingresar al requerimiento
    Cuando seleccionar "Contrapartida"
    Entonces agregamos descripcion "Prueba" y valor

    Dado seleccionar "Agregar"
    Cuando seleccionar "Guardar"
    Entonces seleccionar "Aceptar"

    Dado seleccionar "Enviar"
    Cuando seleccionar "Si"
    Entonces seleccionar "Aceptar"

    #Revisar requerimiento

    Dado cerrar sesion
    Cuando Ingresar usuario "userwapi03@saludcapital.gov.co" y  contraseña "112233"
    Entonces Ingresamos a la pantalla "Modificaciones solicitades"

    Dado ingresar al requerimiento
    Cuando revisar requermiento
    Entonces agregar area "Planeación", concepto "Aprobado" y una observacion "El requerimiento cumple todas lo solicitado"

    Dado seleccionar "Anadir"
    Cuando seleccionar "Revisado"
    Entonces cerrar sesion

    #Aprobar requerimiento

    Dado Ingresar usuario "userwapi02@saludcapital.gov.co" y  contraseña "112233"
    Cuando Ingresamos a la pantalla "Modificaciones solicitades"
    Entonces ingresar al requerimiento

    Dado revisar requermiento
    Cuando seleccionar "Cancelar"
    Entonces seleccionar "Enviar revisiones"

    #Importar CDPs/RPs

    Dado agregar un comentario de la revision "Prueba"
    Cuando seleccionar "Aprobar"
    Entonces seleccionar "Aceptar"

    Dado Ingresamos a la pantalla "PAA"
    Cuando adjuntar archivo xlsx
    Entonces seleccionar "Aceptar"

    Dado cerrar sesion
    Cuando Ingresar usuario "userwapi01@saludcapital.gov.co" y  contraseña "112233"
    Entonces Ingresamos a la pantalla "PAA"

    Dado filtramos codigo del proyecto "7835"
    Cuando seleccionamos proyecto
    Entonces filtrar numero requerimiento

    Dado seleccionar "CDPs"
    Cuando ingresar al RPs
    Entonces validar dependencia distribuir sea 0

    Dado seleccionar "Notificar"
    Cuando seleccionar "Aceptar"
    Entonces cerrar sesion

    Dado Ingresar usuario "userwapi02@saludcapital.gov.co" y  contraseña "112233"
    Cuando Ingresamos a la pantalla "PAA"
    Entonces filtramos codigo del proyecto "7835"

    Dado seleccionamos proyecto
    Cuando filtrar numero requerimiento
    Entonces seleccionar "CDPs"

    Dado seleccionar CDPS
    Cuando seleccionar "Habilitar"
    Entonces seleccionar "Aceptar"

    Dado cerrar sesion
