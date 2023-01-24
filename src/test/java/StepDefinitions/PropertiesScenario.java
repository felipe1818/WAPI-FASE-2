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
        functions.switchToNewTab("https://blue-field-0fa35d80f-qas.eastus2.2.azurestaticapps.net/#/Login", "Wapi");
        functions.attachScreenShot();
        functions.iWaitTime(5);
    }

    @Cuando("ingresa las credenciales email {string} y contrasena {string}")
    public void ingresacredenciales(String email, String contrasena) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iSendClearToElement("usuario");
        functions.iSetElementWithText("usuario", email);
        functions.iWaitTime(2);
        functions.iSendClearToElement("contrasena");
        functions.iSetElementWithText("contrasena", contrasena);
        functions.iWaitTime(2);
        functions.iClicInElement("iniciarSesion");
        functions.iWaitTime(5);
    }

    @Entonces("se visualiza el inicio")
    public void viualizainicio() throws IOException, InterruptedException {
        functions.attachScreenShot();
        functions.iWaitTime(10);
    }

    @Dado("podra dirigirse a la pantalla {string}")
    public void dirigirsepantallaPAA(String pantalla) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("menu");
        functions.iWaitTime(2);
        functions.iClicInElement("Plan anual");
        functions.iWaitTime(2);
        functions.iClicInElement(pantalla);
    }
    @Dado("dirigirse a la pantalla {string}")
    public void dirigirspantallaPAA(String pantalla) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("menu");
        functions.iWaitTime(2);
        functions.iClicInElement(pantalla);
    }

    @Cuando("ordenar filtro por desendente")
    public void ordenarfiltrodesendente() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iWaitTime(5);
        functions.iClicInElement("filtro");
        functions.iWaitTime(5);
        functions.iClicInElement("Ordenar por");
        functions.iWaitTime(5);
        functions.iClicInElement("Subsecretaria");
        functions.iWaitTime(5);
        functions.iClicInElement("filtrar");
        functions.iWaitTime(10);
        functions.attachScreenShot();
    }

    @Cuando("dar clic en requerimiento")
    public void seleccionarequerimiento() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("requerimiento");
        functions.iWaitTime(5);
        functions.attachScreenShot();
    }

    @Dado("se filtra se selecciona y da clic en resumen")
    public void filtraseleccionaresumen() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("seleccionar");
        functions.iWaitTime(5);
        functions.iClicInElement("resumen");
        functions.iWaitTime(5);
        functions.attachScreenShot();
    }

    @Dado("se filtra se selecciona y da clic en {string}")
    public void filtraseleccionaaprobar(String boton) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("seleccionar");
        functions.iWaitTime(5);
        functions.iClicInElement(boton);
        functions.attachScreenShot();
    }
    @Dado("se filtra se selecciona")
    public void filtraselecciona() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("seleccionar");
        functions.iWaitTime(5);
        functions.attachScreenShot();
    }

    @Cuando("regresamos al PAA")
    public void regresamosPAA() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("regresar");
        functions.iWaitTime(10);
        functions.attachScreenShot();
    }



    @Dado("seleccionar propiedades requerimiento")
    public void selecicionarpropiedadesrequerimiento() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("propiedadRequerimiento");
        functions.iWaitTime(10);
        functions.attachScreenShot();
    }

    @Cuando("regresamos requerimiento")
    public void regresarrequerimiento() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("cancelar");
        functions.iWaitTime(10);
        functions.attachScreenShot();
    }
    @Dado("regresamos requerimientos")
    public void regresarrequerimientos() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("cancelarModi");
        functions.iWaitTime(10);
        functions.attachScreenShot();
    }

    @Entonces("seleccionar solicitarModificacion")
    public void seleccionarSolicitarModificaicon() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.scrollToElement("solicitarModificaicon");
        functions.iClicInElement("solicitarModificaicon");
        functions.iWaitTime(10);
        functions.attachScreenShot();
    }

    @Dado("se visualiza la pantalla solicitarModificacion")
    public void visualizapantallasolicitarmodificacion() throws IOException, InterruptedException {
        functions.iWaitTime(10);
        functions.attachScreenShot();
    }

    @Entonces("crear una solicitud nueva")
    public void crearsolicitudnueva() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("crearNuevo");
        functions.iWaitTime(10);
        functions.attachScreenShot();
    }
    @Cuando("Abrir pop up requerimiento")
    public void abrirrequerimiento() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("Modificacion");
        functions.iWaitTime(10);
        functions.attachScreenShot();
    }

    @Dado("se visualiza la pantalla propiedarequerimiento")
    public void visualizapantallapropiedadrequerimiento(){

    }


    @Entonces("Se filtra {string} {string}")
    public void filtraRequerimiento(String campo,String numero) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.attachScreenShot();
        functions.iWaitTime(5);
        functions.iClicInElement("filtrar");
        functions.iWaitTime(5);
        functions.iClicInElement("Buscar por:");
        functions.iWaitTime(5);
        functions.iSetElementWithText(campo, numero);
        functions.iWaitTime(5);
        functions.scrollToElement("filtrar");
        functions.iClicInElement("filtrar");
        functions.iWaitTime(5);
        functions.attachScreenShot();
    }
    @Entonces("filtra {string} {string}")
    public void filtraRequerimient(String campo,String numero) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.attachScreenShot();
        functions.iWaitTime(5);
        functions.iClicInElement("filtrar1");
        functions.iWaitTime(5);
        functions.iClicInElement("Buscar por:");
        functions.iWaitTime(5);
        functions.iSetElementWithText(campo, numero);
        functions.iWaitTime(5);
        functions.scrollToElement("filtrar1");
        functions.iClicInElement("filtrar1");
        functions.iWaitTime(5);
        functions.attachScreenShot();
    }
    @Entonces("Se filtra {string} {string} {string} {string}")
    public void filtraRequerimientoModificacion(String campo,String numero, String campo1, String numero1) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.attachScreenShot();
        functions.iWaitTime(5);
        functions.iClicInElement("filtrar");
        functions.iWaitTime(5);
        functions.iClicInElement("Buscar por:");
        functions.iWaitTime(5);
        functions.iSetElementWithText(campo, numero);
        functions.iWaitTime(5);
        functions.iSetElementWithText(campo1, numero1);
        functions.iWaitTime(5);
        functions.iClicInElement("filtrar");
        functions.iWaitTime(5);
        functions.attachScreenShot();
    }
    @Entonces("Se filtras {string} {string} {string} {string}")
    public void filtrasRequerimientoModificacion(String campo,String numero, String campo1, String numero1) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.attachScreenShot();
        functions.iWaitTime(5);
        functions.iClicInElement("filtrar");
        functions.iWaitTime(5);
        functions.iClicInElement("Buscar por:");
        functions.iWaitTime(5);
        functions.iClicInElement(campo);
        functions.iSelectContainsText("listadespegable", numero);
        functions.iWaitTime(5);
        functions.iSetElementWithText(campo1, numero1);
        functions.iWaitTime(5);
        functions.iClicInElement("filtrar");
        functions.iWaitTime(5);
        functions.attachScreenShot();
    }

    @Dado("selecciona y se {string} requerimiento")
    public void seleccionaseagregarequerimiento(String Boton) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("SeleccionarReque");
        functions.iWaitTime(5);
        functions.iClicInElement(Boton);
    }

    @Cuando("se debe visualizar el requerimiento añadido")
    public void debevisualizarrequerimientoanadido() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.attachScreenShot();
        functions.iClicInElement("Tablarequerimiento");
        functions.iWaitTime(5);
    }

    @Dado("Seleccionar el boton contrapartida")
    public void seleccionarbotóncontrapartida() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("contrapartida");
        functions.iWaitTime(5);
    }

    @Entonces("agregamos descripcion {string}")
    public void agregardescripcion(String descripcion) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iSetElementWithText("descripcion", descripcion);
        functions.iWaitTime(5);
    }

    @Dado("agregamos valor aumenta {string} y valor que disminuye {string}")
    public void agregamosvaloraumentaydisminuye(String aumenta, String disminuye) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iSetElementWithText("aumenta", aumenta);
        functions.iWaitTime(5);
        functions.iSetElementWithText("disminuye", disminuye);
        functions.iWaitTime(5);
    }

    @Cuando("seleccionaremos el boton {string}")
    public void seleccionarboton(String boton) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement(boton);
        functions.iWaitTime(5);
    }

    @Dado("agregar numero requerimiento {string} y dependencia {string}")
    public void agregarrequerimeintodependencia(String requerimiento, String dependencia) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("informacionBasica");
        functions.iSendClearToElement("requerimeinto");
        functions.iSetElementWithText("requerimeinto", requerimiento);
        functions.iWaitTime(5);
        functions.iSendClearToElement("dependencia");
        functions.iSetElementWithText("dependencia", dependencia);
        functions.iSelectContainsText("listadespegable", dependencia);
        functions.iWaitTime(5);
    }

    @Cuando("agregar mes inicio {string}, mes oferta {string} y mes inicio contrato {string}")
    public void agregarmesiniciomesoferta(String inicio, String oferta, String contrato) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("mesinicio");
        functions.iSelectContainsText("listadespegable", inicio);
        functions.iWaitTime(5);
        functions.iClicInElement("mesoferta");
        functions.iSelectContainsText("listadespegable", oferta);
        functions.iWaitTime(5);
        functions.iClicInElement("mescontrato");
        functions.iSelectContainsText("listadespegable", contrato);
        functions.iWaitTime(5);
    }

    @Cuando("agregar la duracion del contrato mes {string} dias {string}")
    public void agregarduracioncontratomesdias(String meses, String dias) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iSendClearToElement("meses");
        functions.iSetElementWithText("meses", meses);
        functions.iWaitTime(2);
        functions.iSendClearToElement("dias");
        functions.iSetElementWithText("dias", dias);
        functions.iWaitTime(5);
        functions.attachScreenShot();
    }

    @Dado("agregar modalidad de seleccion {string} y actuacion contractual {string}")
    public void agregarmodalidadcontractual(String seleccion, String contractual) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iSendClearToElement("seleccion");
        functions.iSetElementWithText("seleccion", seleccion);
        functions.iSelectContainsText("listadespegable", seleccion);
        functions.iWaitTime(2);
        functions.iClicInElement("contractual");
        functions.iSelectContainsText("listadespegable", contractual);
        functions.iWaitTime(2);
        functions.attachScreenShot();
    }

    @Cuando("agrega Numero de contrato {string}")
    public void agreganumerocontrato(String NumContrato) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iSendClearToElement("NumContrato");
        functions.iSetElementWithText("NumContrato", NumContrato);
        functions.iWaitTime(2);
        functions.attachScreenShot();
    }

    @Cuando("se agrega tipo de contrato {string} y perfil {string}")
    public void agregacontratoperfil(String contrato, String perfil) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("contrato");
        functions.iSelectContainsText("listadespegable", contrato);
        functions.iWaitTime(2);
        functions.iClicInElement("perfil");
        functions.iSelectContainsText("listadespegable", perfil);
        functions.iWaitTime(2);
        functions.attachScreenShot();
    }

    @Entonces("se agrega valor honorario {string} y cantidad de contratos {string}")
    public void agregavalorhonorariocantidadcontratos(String honorario, String contratos) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iSetElementWithText("honorario", honorario);
        functions.iWaitTime(2);
        functions.iSetElementWithText("contratos", contratos);
        functions.iWaitTime(2);
        functions.attachScreenShot();
    }

    @Dado("agregar descripcion {string}")
    public void agregardescripcionn(String descripcioncontrato) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iSendClearToElement("descripcioncontrato");
        functions.iSetElementWithText("descripcioncontrato", descripcioncontrato);
        functions.iWaitTime(2);
        functions.attachScreenShot();
    }

    @Cuando("agregar mes {string} y vigencia de los recursos {string}")
    public void agregarmesvigenciarecursos(String mes, String recursos) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("informacionBasica");
        functions.iWaitTime(2);
        functions.iClicInElement("clasificacionPresupuestal");
        functions.iClicInElement("mes");
        functions.iSelectContainsText("listadespegable", mes);
        functions.iWaitTime(2);
        functions.iClicInElement("recursos");
        functions.iSelectContainsText("listadespegable", recursos);
        functions.iWaitTime(2);
        functions.attachScreenShot();
    }

    @Cuando("agregar auxiliar {string} y detalle fuente {string}")
    public void agregardetalleactividad(String auxiliar, String detallefuente) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("auxiliar");
        functions.iSelectContainsText("listadespegable", auxiliar);
        functions.iWaitTime(2);
        functions.iClicInElement("detallefuente");
        functions.iSelectContainsText("listadespegable", detallefuente);
        functions.iWaitTime(2);
        functions.attachScreenShot();
    }

    @Dado("agregar actividad {string}, MGA {string} y POSPRE {string}")
    public void agregaractividadmgapospre(String actividad, String MGA, String POSPRE) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("actividad");
        functions.iSelectContainsText("listadespegable", actividad);
        functions.iWaitTime(2);
        functions.iSendClearToElement("MGA");
        functions.iSetElementWithText("MGA", MGA);
        functions.iSelectContainsText("listadespegable", MGA);
        functions.iWaitTime(2);
        functions.iSendClearToElement("POSPRE");
        functions.iSetElementWithText("POSPRE", POSPRE);
        functions.iSelectContainsText("listadespegable", POSPRE);
        functions.iWaitTime(2);
        functions.iClicInElement("Anadir");
        functions.attachScreenShot();
    }

    @Cuando("agregar codigo UNSPSC {string}")
    public void agregarcodigoUNSPSC(String UNSPSC) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.scrollToElement("codigoUNSP");
        functions.iClicInElement("codigoUNSP");
        functions.iSendClearToElement("UNSPSC");
        functions.iSetElementWithText("UNSPSC", UNSPSC);
        functions.iWaitTime(2);
        functions.iSelectContainsText("listadespegable", UNSPSC);
        functions.iWaitTime(2);
        functions.scrollToElement("anadirr");
        functions.iClicInElement("anadirr");
        functions.iWaitTime(5);
        functions.iClicInElement("codigoUNSP");
    }

    @Entonces("visualiza la sesion aprobacion inicial")
    public void visualizasesionaprobacioninicial() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("aprobacionInicial");
        functions.iWaitTime(5);
        functions.iClicInElement("aprobacionInicial");
        functions.iClicInElement("clasificacionPresupuestal");
        functions.iWaitTime(5);
    }

    @Dado("agregamos area {string} y conceptos {string}")
    public void agregamosareaconceptos(String area, String concepto) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iWaitTime(2);
        functions.iClicInElement("area");
        functions.iSelectContainsText("listadespegable", area);
        functions.iWaitTime(2);
        functions.iClicInElement("concepto");
        functions.iSelectContainsText("listadespegable", concepto);
        functions.iWaitTime(2);
        functions.attachScreenShot();
    }

    @Cuando("se agrega la observacion {string}")
    public void agregaobserca(String obser) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iSetElementWithText("obser", obser);
        functions.iWaitTime(2);
        functions.iClicInElement("anadrr");
        functions.iWaitTime(5);
    }

    @Dado("Revisiones")
    public void revisiones() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("informacionBasica");
        functions.iClicInElement("clasificacionPresupuestal");
        functions.iWaitTime(2);
        functions.iClicInElement("revisiones");
    }

    @Entonces("dar clic en el botón {string}")
    public void darclicboton(String boton) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.scrollToElement(boton);
        functions.iClicInElement(boton);
        functions.iWaitTime(5);
    }

    @Cuando("agregamos una fuente de recursos {string}")
    public void agregarfuenterecursos(String fuente) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("fuenteResumen");
        functions.iSelectContainsText("listadespegable", fuente);
        functions.iWaitTime(2);
        functions.attachScreenShot();
    }

    @Cuando("se agrega solicitud agregamos una justificacion {string}")
    public void agrgeajustificacion(String justificacion) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.scrollToElement("anadir justificacion");
        functions.iSetElementWithText("anadir justificacion", justificacion);
        functions.attachScreenShot();
        functions.iWaitTime(2);
    }

    @Dado("cerrar sesion")
    public void cerrarsesion() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iClicInElement("menu");
        functions.iWaitTime(2);
        functions.iClicInElement("cerrarSesion");
        functions.iWaitTime(2);
    }

    @Entonces("agregar checks")
    public void agregarchecks() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.scrollToElement("check1");
        functions.iClicInElement("check1");
        functions.iWaitTime(2);
        /*functions.iClicInElement("check2");
        functions.iWaitTime(2);
        functions.iClicInElement("check3");
        functions.iWaitTime(2);
        functions.iClicInElement("check4");
        functions.iWaitTime(2);*/
    }

    @Dado("ingresar un comentario para la revision {string}")
    public void ingresarcomentariorevision(String comentario) throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.iSetElementWithText("cometarioRevision", comentario);
        functions.iWaitTime(2);
    }

    @Entonces("subir archivo")
    public void subirarchivo() throws Exception {
        functions.iLoadTheDOMInformation("Principal.json");
        functions.SaveInScenarioFile("documento", "pdf");
        functions.iSetElementWithKeyValue("adjuntar", "documento");
    }
}