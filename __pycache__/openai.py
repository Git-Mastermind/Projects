from langchain import ChatChain

chain = ChatChain.with_memory()

response = chain.run("Recommend books like Percy Jackson")
print(response)
