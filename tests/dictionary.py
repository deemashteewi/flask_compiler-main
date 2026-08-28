from flask import Flask, render_template, request, redirect, url_for

app = Flask(__name__)

products = [
    {
        "id": 1,
        "name": "Laptop",
        "price": 999.99,
        "details": "High performance laptop with 16GB RAM",
        "image": "https://cdn.mos.cms.futurecdn.net/Ukb33rWBxQ2gH2vHmq64B3.jpg"
    },
    {
        "id": 2,
        "name": "Phone",
        "price": 699.99,
        "details": "Smartphone with advanced camera",
        "image": "https://i.pcmag.com/imagery/roundups/05PB0LirhK28UDCznfU5X4O-8..v1740688630.jpg"
    }
]

@app.route('/')
def display_products():
    return render_template('products.html', products=products)

@app.route('/add', methods=['GET', 'POST'])
def add_product():
    if request.method == 'POST':
        name = request.form['name']
        price = request.form['price']
        details = request.form['details']
        image = request.form['image']

        new_id = max([p['id'] for p in products]) + 1

        new_product = {
            "id": new_id,
            "name": name,
            "price": float(price),
            "details": details,
            "image": image
        }

        products.append(new_product)
        return redirect(url_for('display_products'))

    return render_template('add_product.html')

@app.route('/product/<int:product_id>')
def product_detail(product_id):
    product = None
    for p in products:
        if p['id'] == product_id:
            product = p
            break

    return render_template('product_detail.html', product=product)

if __name__ == '__main__':
    app.run(debug=True, port=8080)
