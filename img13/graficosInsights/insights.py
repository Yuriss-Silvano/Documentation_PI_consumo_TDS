import matplotlib.pyplot as plt

# Gráfico 1 - Pizza
labels1 = ['Comprariam (72%)', 'Não ou indecisos (28%)']
sizes1 = [72, 28]
colors1 = ['#2ca02c', '#ff7f0e']

plt.figure(figsize=(6,6))
plt.pie(sizes1, labels=labels1, colors=colors1, autopct='%1.0f%%', startangle=90, explode=(0.05, 0))
plt.title('Consumidores dispostos a pagar mais por produtos\ncom menor impacto ambiental (com comparador claro)', fontsize=10)
plt.axis('equal')
plt.savefig('grafico1_consumidores.png', dpi=300)
plt.show()

# Gráfico 2 - Barra simples
produtos = ['Produtos monitorados\npelo PROCON/SP (semanal)']
quantidade = [300]

plt.figure(figsize=(4,6))
plt.bar(produtos, quantidade, color='#1f77b4', width=0.5)
plt.ylabel('Quantidade de produtos')
plt.title('Cobertura da pesquisa de preços - PROCON/SP', fontsize=10)
plt.ylim(0, 350)
for i, v in enumerate(quantidade):
    plt.text(i, v + 10, f'{v}+', ha='center', va='bottom')
plt.savefig('grafico2_procon.png', dpi=300)
plt.show()

# Gráfico 3 (opcional, se tiver os dados)
labels3 = ['Informam corretamente', 'Informação ausente/incompleta']
sizes3 = [45, 55]
colors3 = ['#d62728', '#9467bd']

plt.figure(figsize=(6,4))
plt.bar(labels3, sizes3, color=colors3)
plt.ylabel('Percentual de estabelecimentos (%)')
plt.title('Aderência à Lei da Transparência de Preços (dados locais fictícios)', fontsize=10)
plt.ylim(0, 100)
for i, v in enumerate(sizes3):
    plt.text(i, v + 2, f'{v}%', ha='center')
plt.savefig('grafico3_leitura.png', dpi=300)
plt.show()