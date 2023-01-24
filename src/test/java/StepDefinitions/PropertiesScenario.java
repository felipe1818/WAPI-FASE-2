package StepDefinitions;

import Functions.SeleniumFunctions;
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
        functions.iWaitTime(5);
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
        functions.iLoadTheDOMInformation("Principal.json");
        functions.scrollToElement("Menu");
        functions.iClicInElement("Menu");
        functions.scrollToElement("Plan anual");
        functions.iClicInElement("Plan anual");
        functions.scrollToElement(pantalla);
        functions.iClicInElement(pantalla);
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
        functions.iLoadTheDOMInformation("Principal-json");
        functions.scrollToHorizontal("Requerimiento");
        functions.iClicInElement("Requerimiento");
    }

    @Entonces("seleccionar {string}")
    public void seleccionarboton(String boton) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.scrollToElement(boton);
        functions.iClicInElement(boton);
    }

    @Cuando("agregamos Numero de requerimiento {string} y dependencia destino {string}")
    public void agregamosnumerorequerimeitndependencia(String numerorequerimiento, String dependenciadestino) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iSetElementWithText("numerorequerimiento", numerorequerimiento);
        functions.iSetElementWithText("dependenciadestino", dependenciadestino);
    }

    @Entonces("agregar fecha estiamdo inicio {string}, mes estiamdo presentacion {string} y mes inicio ejecucion {string}")
    public void agregarfechaestimadopresentacionejecucion(String fechaesimado, String fechapresentacion, String fechaejecucion) throws Exception {
        functions.iLoadTheDOMInformation("Principal,json");
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
        functions.iLoadTheDOMInformation("Principal,json");
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
    public void ingresarmesfecharecursosauxiliar(){

    }

}