package pages;

public class PaginaCompraCurso extends BasePage{
    
    private String comprarAhoraLink = "//a[normalize-space()='Compra ahora' and @href]";

    public PaginaCompraCurso(){
        super(driver);
    }

    public void clickComprarAhoraLink(){
        clickElement(comprarAhoraLink);
    }
}
