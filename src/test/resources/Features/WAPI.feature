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
    Cuando agregamos Numero de requerimiento "" y dependencia destino ""
    Entonces agregar fecha estiamdo inicio "", mes estiamdo presentacion "" y mes inicio ejecucion ""

    Dado ingresar la duracion estimada del contrato Mes "" Dias ""
    Cuando ingresar modalidad seleccion "" y actuacion contractual ""
    Entonces ingresar tipo contrato "" perfil "" valor Honorario ""

    Dado ingresar contidad contratos "" y descripcion ""
    Cuando ingresa mes "" fecha recursos "" y auxuliar ""
    Entonces agregar detalle fuente "" y actividad ""

    Dado seleccionar "anadir"
    Cuando editamos cadena presupuestal
    Entonces agregar un valor ""

    Dado seleccionar "Aceptar"
    Cuando agregar codigo UNSPSC ""
    Entonces seleccionar "anadi"

    Dado seleccionar "Guardar"
    Cuando seleccionar "Aceptar"
    Entonces agregar justificacion "Prueba"

    Dado adjuntar archivo pdf
    Cuando seleccionar "Guarda"
    Entonces seleccionar "Aceptar"

    Dado ingresar al requerimiento
    Cuando seleccionar "Contrapartida"
    Entonces agregamos descripcion "Prueba" y valor

    Dado seleccionar "Agregar"
    Cuando seleccionar "Guarda"
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



