package mx.petcalli.app.util;
import mx.petcalli.app.model.Product;
import mx.petcalli.app.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
/*@Order(3)
@Profile("devH2")*/

public class ProductDataLoader implements CommandLineRunner {
 
 @Autowired
 ProductRepository productRepository;
 
private static final Logger log = LoggerFactory.getLogger(ProductDataLoader.class);

 @Override
 public void run(String... args) throws Exception {

	 
  productRepository.save(new Product("Mother & Babycat Comida Seca", "Royal Canin", 
  "https://cdn.royalcanin-weshare-online.io/rz_NTIcBRYZmsWpcJPUx/v56/00030111450036-cf-gs1?w=640&fm=jpg&auto=format,compress", 610.00, 
    "Nutricion completa y balanceada para gatos en gestion y lactancia, así como para sus cachorros (de 1 a 4 meses de edad) durante el destete.",
  "NA", "1.3 kg"));
  
  
  productRepository.save(new Product("Mother & Babycat Comida Seca", "Royal Canin", 
	 "https://cdn.royalcanin-weshare-online.io/rz_NTIcBRYZmsWpcJPUx/v56/00030111450036-cf-gs1?w=640&fm=jpg&auto=format,compress", 855.00,
   "Nutricion completa y balanceada para gatos en gestion y lactancia, así como para sus cachorros (de 1 a 4 meses de edad) durante el destete.",
   "NA", "2.6 kg"));
  
  productRepository.save(new Product("Cachorro Comida Maine", "Royal Canin", 
   "https://cdn.royalcanin-weshare-online.io/ylaNe28BBKJuub5qxmK_/v62/2019-c-mainecoon-kitten-spt-fbn-packshot-b2?w=640&fm=jpg&auto=format,compress", 650.00,
     "Nutricion completa y balanceada para gatos en edad temprana (de 1 a 4 meses de edad) durante el destete.",
     "NA", "1.3 kg"));
  
  productRepository.save(new Product("Cuidado De Peso Comida Seca", "Royal Canin", 
  "https://cdn.royalcanin-weshare-online.io/fOd3TYcBaPOZra8qUPya/v64/00030111442703f-cf-gs1?w=640&fm=jpg&auto=format,compress", 1625.00,
  "Nutrición completa y balanceada para gatos adultos, formulada para ayudar a mantenerles saludable el tracto urinario.",
   "NA", "6.3 kg"));
  
  productRepository.save(new Product("Digestión Sensible Comida Seca", "Royal Canin",  
   "https://cdn.royalcanin-weshare-online.io/xFaJem8BBKJuub5qBWIv/v70/2019-c-sensitivedigestion-spt-fhn-packshot-b2?w=640&fm=jpg&auto=format,compress", 610.00,
  "Formulada para gatos adultos con sensibilidad en el tracto digestivo.",
    "NA", "2.8 kg"));
  
 
  

 }
 }