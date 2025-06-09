INSERT INTO categoria (nome, descricao) VALUES ('Eletronicos', 'Produtos eletronicos em geral');
INSERT INTO categoria (nome, descricao) VALUES ('Informatica', 'Produtos de informatica e computadores');
INSERT INTO categoria (nome, descricao) VALUES ('Moveis', 'Moveis para casa e escritorio');
INSERT INTO categoria (nome, descricao) VALUES ('Alimentacao', 'Produtos alimenticios');


INSERT INTO fornecedor (nome, email, telefone, NIF) VALUES ('ZuaTecnoloia', 'zua@gmail.com', '+351 931 400174', '123456789');
INSERT INTO fornecedor (nome, email, telefone, NIF) VALUES ('DEVKC', 'devkc@gmail.com', '+351 931 400174', '987654321');


-- Inserir produtos (corrigindo os IDs de categoria)
INSERT INTO produto (nome, preco, quantidade, categoria_id, fornecedor_id) VALUES ('Notebook Dell', 500.00, 2, 2, 1);
INSERT INTO produto (nome, preco, quantidade, categoria_id, fornecedor_id) VALUES ('SmartPhone Samsung', 150.00, 3, 1, 1); 
INSERT INTO produto (nome, preco, quantidade, categoria_id, fornecedor_id) VALUES ('Arroz 5kg', 24.00, 4, 4, 2);
INSERT INTO produto (nome, preco, quantidade, categoria_id, fornecedor_id) VALUES ('Teclado Mecanico', 40.00, 10, 2, 2);  





