package StepDefinitions;

import Functions.SeleniumFunctions;
import io.cucumber.java.an.Cuan;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import org.checkerframework.checker.units.qual.C;

import java.io.IOException;


public class PropertiesScenario {

    SeleniumFunctions functions = new SeleniumFunctions();
    @Dado("el usuario ingresa a la plataforma")
    public void usaurioingresaplataforma() throws Exception {
        functions.switchToNewTab("https://dev.wapi.saludcapital.gov.co/#/Login", "Wapi");
        functions.attachScreenShot();
    }

    @Cuando("Ingresar usuario {string} y  contraseña {string}")
    public void ingresarusuariocontrasena(String usuario, String clave) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iSetElementWithText("usuario", usuario);
        functions.iSetElementWithText("clave", clave);
        functions.scrollToElement("IniciarSesion");
        functions.iClicInElement("IniciarSesion");
    }

    @Entonces("Ingresamos a la pantalla {string}")
    public void ingresamospantalla(String pantalla) throws Exception {
        try {
            functions.iLoadTheDOMInformation("Principal.json");
            functions.scrollToElement("Menu");
            functions.iClicInElement("Menu");
            functions.scrollToElement("Plan anual");
            functions.iClicInElement("Plan anual");
            functions.scrollToElement(pantalla);
            functions.iClicInElement(pantalla);
        }catch (Exception e){
            functions.scrollToElement("Plan anual");
            functions.iClicInElement("Plan anual");
            functions.scrollToElement(pantalla);
            functions.iClicInElement(pantalla);
        }
    }

    @Dado("filtramos codigo del proyecto {string}")
    public void filtramoscodigoproyecto(String codigoproyecto) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.scrollToElement("Filtrar");
        functions.iClicInElement("Filtrar");
        functions.scrollToElement("Buscar Por:");
        functions.iClicInElement("Buscar Por:");
        functions.scrollToElement("codigoproyecto");
        functions.iSetElementWithText("codigoproyecto", codigoproyecto);
        functions.scrollToElement("Filtrar");
        functions.iClicInElement("Filtrar");
        functions.iWaitTime(2);
    }

    @Cuando("seleccionamos proyecto")
    public void seleccionamosproyecto() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.scrollToHorizontal("Requerimiento");
        functions.iClicInElement("Requerimiento");
    }

    @Entonces("seleccionar {string}")
    public void seleccionarboton(String boton) throws Exception {
        try{
            functions.iLoadTheDOMInformation("Principal.json");
            functions.scrollToElement(boton);
            functions.iClicInElement(boton);
        }catch (Exception e){
            functions.scrollToElement(boton);
            functions.iClicInElement(boton);
        }
    }

    @Cuando("agregamos Numero de requerimiento {string} y dependencia destino {string}")
    public void agregamosnumerorequerimeitndependencia(String numerorequerimiento, String dependenciadestino) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iSetElementWithText("numerorequerimiento", numerorequerimiento);
        functions.iSaveTextOfElementInScenario("numeroreq", "numerorequerimiento");

        functions.iSetElementWithText("dependenciadestino", dependenciadestino);
        functions.iSelectContainsText("listadespegable", dependenciadestino);
    }

    @Entonces("agregar fecha estiamdo inicio {string}, mes estiamdo presentacion {string} y mes inicio ejecucion {string}")
    public void agregarfechaestimadopresentacionejecucion(String fechaesimado, String fechapresentacion, String fechaejecucion) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.scrollToElement("fechaesimado");
        functions.iClicInElement("fechaesimado");
        functions.iSelectContainsText("listadespegable", fechaesimado);
        functions.scrollToElement("fechapresentacion");
        functions.iClicInElement("fechapresentacion");
        functions.iSelectContainsText("listadespegable", fechapresentacion);
        functions.scrollToElement("fechaejecucion");
        functions.iClicInElement("fechaejecucion");
        functions.iSelectContainsText("listadespegable", fechaejecucion);
    }

    @Dado("ingresar la duracion estimada del contrato Mes {string} Dias {string}")
    public void ingresarduracionestiamdacontratomesdia(String mes, String dia) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iSetElementWithText("mes", mes);
        functions.iSetElementWithText("dia", dia);
    }

    @Cuando("ingresar modalidad seleccion {string} y actuacion contractual {string}")
    public void ingresarmodalidadseleccioncontractual(String modalidadseleccion, String actuacioncontractual) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.scrollToElement("modalidadseleccion");
        functions.iClicInElement("modalidadseleccion");
        functions.iSelectContainsText("listadespegable", modalidadseleccion);

        functions.scrollToElement("actuacioncontractual");
        functions.iClicInElement("actuacioncontractual");
        functions.iSelectContainsText("listadespegable", actuacioncontractual);
    }

    @Entonces("ingresar tipo contrato {string} perfil {string} valor Honorario {string}")
    public void ingrsartipocontratroperfilvalor(String tipocontrato, String perfil, String valorhonorario) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.scrollToElement("tipocontrato");
        functions.iClicInElement("tipocontrato");
        functions.iSelectContainsText("listadespegable", tipocontrato);

        functions.scrollToElement("perfil");
        functions.iClicInElement("perfil");
        functions.iSelectContainsText("listadespegable", perfil);

        functions.scrollToElement("valorhonorario");
        functions.iSetElementWithText("valorhonorario", valorhonorario);
    }

    @Dado("ingresar contidad contratos {string} y descripcion {string}")
    public void ingresarcontidadcontraodescripcion(String cantidadcontrato, String descripcion) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.scrollToHorizontal("cantidadcontrato");
        functions.iSetElementWithText("cantidadcontrato", cantidadcontrato);

        functions.scrollToHorizontal("descripcion");
        functions.iSetElementWithText("descripcion", descripcion);

        functions.iClicInElement("informacionBasicaProyecto");
    }
    @Cuando("ingresa mes {string} fecha recursos {string} y auxuliar {string}")
    public void ingresarmesfecharecursosauxiliar(String mesclasificacion, String fecharecurso, String auxiliar) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.scrollToElement("mesclasificacion");
        functions.iClicInElement("mesclasificacion");
        functions.iSelectContainsText("listadespegable", mesclasificacion);

        functions.scrollToElement("fecharecurso");
        functions.iClicInElement("fecharecurso");
        functions.iSelectContainsText("listadespegable", fecharecurso);

        functions.scrollToElement("auxiliar");
        functions.iClicInElement("auxiliar");
        functions.iSelectContainsText("listadespegable", auxiliar);
    }

    @Entonces("agregar detalle fuente {string} y actividad {string}")
    public void agregardetallefuenteactividad(String detallefuente, String actividad) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.scrollToElement("detallefuente");
        functions.iClicInElement("detallefuente");
        functions.iSelectContainsText("listadespegable", detallefuente);
        functions.iSaveTextOfElementInScenario("detalle", "detallefuente");

        functions.scrollToElement("actividad");
        functions.iClicInElement("actividad");
        functions.iSelectContainsText("listadespegable", actividad);
    }

    @Cuando("editamos cadena presupuestal")
    public void editacadenapresupuestal() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.scrollToHorizontal("editarcadena");
        functions.iClicInElement("editarcadena");
    }

    @Entonces("agregar un valor {string}")
    public void agregarvalor(String valoraumenta) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iSetElementWithText("valoraumenta", valoraumenta);
        functions.iSaveTextOfElementInScenario("valordismunuye", "valoraumenta");
    }

    @Cuando("agregar codigo UNSPSC {string}")
    public void agregarcodigoUNSPSC(String UNSPSC) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.scrollToElement("codigoUNSPSC");
        functions.iClicInElement("codigoUNSPSC");

        functions.scrollToElement("UNSPSC");
        functions.iSetElementWithText("UNSPSC", UNSPSC);
        functions.iSelectContainsText("listadespegable", UNSPSC);
    }

    @Entonces("agregar justificacion {string}")
    public void agregarjustificacion(String justificacion) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iSetElementWithText("justificacion", justificacion);
    }

    @Dado("adjuntar archivo pdf")
    public void adjuntararchivopdf() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.SaveInScenarioFile("documento", "pdf");
        functions.iSetElementWithKeyValue("adjuntar", "documento");
    }

    @Dado("ingresar al requerimiento")
    public void ingresarrequerimeitno() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.scrollToHorizontal("solicitudM");
        functions.iClicInElement("solicitudM");
    }

    @Entonces("agregamos descripcion {string} y valor")
    public void agreamosdescripcionvalor(String descripcion) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iSetElementWithKeyValue("detalles", "detalle");
        functions.iSetElementWithText("descripcio", descripcion);
        functions.iSetElementWithKeyValue("ValorA", "valordismunuye");
    }

    @Dado("cerrar sesion")
    public void cerrarsecion() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("Menu");
        functions.iClicInElement("salir");
    }

    @Cuando("revisar requermiento")
    public void revisarrequerimiento() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.scrollToHorizontal("editarrequerimiento");
        functions.iClicInElement("editarrequerimiento");
    }

   @Entonces("agregar area {string}, concepto {string} y una observacion {string}")
    public void agregaareaconceptoobservaiones(String area, String concepto, String observacion) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
       functions.scrollToElement("area");
       functions.iClicInElement("area");
       functions.iSelectContainsText("listadespegable", area);

       functions.scrollToElement("concepto");
       functions.iClicInElement("concepto");
       functions.iSelectContainsText("listadespegable", concepto);

       functions.scrollToElement("concepto");
       functions.iSetElementWithText("observacion", observacion);
   }

    @Dado("agregar un comentario de la revision {string}")
    public void agregarcometariorevison(String comentariorevision) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iSetElementWithText("comentario", comentariorevision);
    }

    @Cuando("adjuntar archivo xlsx")
    public void adjuntararchivoxlsx() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.SaveInScenarioFile("documento", "xlsx");
        functions.iSetElementWithKeyValue("adjuntarxlsx", "documento");
    }

    @Entonces("filtrar numero requerimiento")
    public void filtratnumerorequerimiento() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.scrollToElement("Filtrar");
        functions.iClicInElement("Filtrar");
        functions.scrollToElement("Buscar Por:");
        functions.iClicInElement("Buscar Por:");
        functions.scrollToElement("codigorequerimiento");
        functions.iSetElementWithKeyValue("codigorequerimiento", "numeroreq");
        functions.scrollToElement("Filtrar");
        functions.iClicInElement("Filtrar");
        functions.iWaitTime(2);
    }

    @Cuando("ingresar al RPs")
    public void ingresaralRPs() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("RPs");
    }
}