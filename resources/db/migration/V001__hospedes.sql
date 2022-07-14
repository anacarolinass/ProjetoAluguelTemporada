CREATE TABLE hospedes(
    id uuid PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    data_nascimento DATE,
    telefone VARCHAR(15),
    cpf VARCHAR(11) UNIQUE,
);

