# coding: utf-8
import string

def lower_word(word):
    return word.lower()

def stop_words_removal(words_set):
    stop_words = []
    for stop_word in stop_words:
        if stop_word in words_set:
            words_set.remove(stop_word)
    return words_set

def create_vocabulary(text_one, text_two):
    #Removing duplicates
    text_one = set(text_one)
    text_two = set(text_two)

    vocabulary = list(text_one | text_two)

    return vocabulary

def create_double_words_set(words_set):
    double_set = []
    for index, word in enumerate(words_set):
        if index + 1 < len(words_set):
            double_set.append(word + ' ' + words_set[index+1])
    return double_set


def word_occurence(vocabulary, text):
    occurence = []
    for word in vocabulary:
        occurences = text.count(word)
        occurence.append(occurences)
    return occurence

#Data input
file_one = open("file_one.txt", "r")
#Getting the string withou punctuation
first_text = file_one.read().translate(str.maketrans('', '', string.punctuation))

file_two = open("file_two.txt", "r")
second_text = file_two.read().translate(str.maketrans('', '', string.punctuation))

#Splitin the text into a words list
first_word_set = first_text.split(' ')
second_word_set = second_text.split(' ')

#Normalizing the list
normalized_first_set = list(map(lower_word, first_word_set))
normalized_second_set = list(map(lower_word, second_word_set))

#Creating double words sets
first_double_words_set = create_double_words_set(normalized_first_set)
second_double_words_set = create_double_words_set(normalized_second_set)

#Removing stop words
normalized_first_set = stop_words_removal(normalized_first_set)
normalized_second_set = stop_words_removal(normalized_second_set)

#Single words set treatment
vocabulary_single_words = create_vocabulary(normalized_first_set, normalized_second_set)
text_one_occurences_single = word_occurence(vocabulary_single_words, normalized_first_set)
text_two_occurences_single = word_occurence(vocabulary_single_words, normalized_second_set)

#Double words set treatment
vocabulary_double_words = create_vocabulary(first_double_words_set, second_double_words_set)
text_one_occurences_double = word_occurence(vocabulary_double_words, first_double_words_set)
text_two_occurences_double = word_occurence(vocabulary_double_words, second_double_words_set)

print('========================================')
print('Vocabulário simples')
for single_word_vocabulary in vocabulary_single_words:
    print(single_word_vocabulary)
print('Ocorrencia em texto 1')
print(text_one_occurences_single)
print('Ocorrencia em texto 2')
print(text_two_occurences_single)


print('========================================')
print('Vocabulário duplo')
for double_words_vocabulary in vocabulary_double_words:
    print(double_words_vocabulary)
print('Ocorrencia em texto 1')
print(text_one_occurences_double)
print('Ocorrencia em texto 2')
print(text_two_occurences_double)
