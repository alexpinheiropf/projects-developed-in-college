class Aluno:   
    # construtor
    def __init__(self, nome, idade, cidade):
        self.nome = nome
        self.idade = idade
        self.cidade = cidade

    def mostraNome(self):
        return self.nome

# metodo main (principal)
if __name__ == "__main__":
    alunos = []    
    a = Aluno('Fahad', 28, 'Passo Fundo')    
    alunos.append(a)

    for aluno in alunos:
        print aluno.mostraNome()
        
    
    
