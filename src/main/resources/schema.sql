CREATE TABLE cliente (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(100),
    email VARCHAR(100)
);

CREATE TABLE factura (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    monto DECIMAL(10,2),
    fecha DATE,
    cliente_id BIGINT,
    FOREIGN KEY (cliente_id) REFERENCES cliente(id)
);
