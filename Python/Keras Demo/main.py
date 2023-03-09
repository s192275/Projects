import tensorflow as tf
mnist = tf.keras.datasets.mnist
(X_train, y_train), (X_test,y_test) = mnist.load_data()
print(X_train.shape)
print(X_test.shape)
X_train, X_test = X_train / 255.0 , X_test / 255.0
model = tf.keras.models.Sequential([
    tf.keras.layers.Flatten(input_shape = (28,28)),
    tf.keras.layers.Dense(200, activation='relu'),
    tf.keras.layers.Dropout(0.2),
    tf.keras.layers.Dense(10)
])

model.compile(
    optimizer='adam',
    loss= tf.keras.losses.SparseCategoricalCrossentropy(from_logits= True),
    metrics= ["accuracy"]
)

model.fit(X_train,y_train,epochs=18)

model.evaluate(X_test, y_test)
