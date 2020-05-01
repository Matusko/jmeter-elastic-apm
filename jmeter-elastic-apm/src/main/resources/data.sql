INSERT INTO pets (id, name, color, specie) VALUES
  (1, 'Bobo', 'black', 'hamster'),
  (2, 'Rocky', 'thats racist', 'dog'),
  (3, 'Snowball', 'white', 'cat'),
  (4, 'Vasilij', 'brown', 'bear') ON CONFLICT (id) DO NOTHING;

ALTER SEQUENCE pets_id_seq RESTART WITH 4;