# Petcalli_Backend

## Integrantes del equipo

- **Valeria Haciel Aceves Sánchez**
- **Katia Lorena Cerón Sandoval**
- **Ana Lilia Cruz Guzmán**
- **Erika González Vázquez**
- **Fernando Alexis Hernández Hernández**
- **Andrea Eunice López Cárdenas**
- **Jose Crescenciano Meza Ortega**
- **Padrón Flores Cristian Alan**
- **Aurelia Robles Pérez**
- **Frida Osorno González**

## Orden para la inserción de registros en tablas  


1. Primero, necesitamos insertar en las tablas que no tienen claves externas como:
    a. Rol
    b. Users
    c. Coupons 
    d. ProductsCategory
    e. PetType

2. Luego necesitamos insertar en las tablas que tienen las claves externas de las tablas que ya hemos declarado, como:
    a. User_Rol
    b. Vendor
    c. Address
    d. Orders
    e. Products
    
3. Finalmente, necesitamos insertar datos en las tablas puente que necesitan las claves externas que ya hemos declarado, en este caso:
    a. Products_has_orders
    b. Coupons_has_orders
