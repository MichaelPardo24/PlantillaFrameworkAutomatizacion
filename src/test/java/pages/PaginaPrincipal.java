package pages;

public class PaginaPrincipal extends BasePage{
    private String elegirPlanLink = "//a[normalize-space()='Elegir Plan' and @href]";
    private String searchButton = "//a[normalize-space()='Comprar curso']";
    private String sectionLink = "//a[normalize-space()='%s' and @href]";   
    public PaginaPrincipal(){
        super(driver);
    }

    //metodo para navegar a www.freerangetesters.com
    public void navigateToFreeRangeTesters(){
        navigateTo("https://www.freerangetesters.com");
    }

    public void clickOnSectionNavigationBar(String section){
        //reemplazar el marcador de posicion en section link con el nombre 
        String xpathString = String.format(sectionLink, section);
        clickElement(xpathString);
    }


    public void clickElegirPlan(){
        clickElement(elegirPlanLink);
    }
}