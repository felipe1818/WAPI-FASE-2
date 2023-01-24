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