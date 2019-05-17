import pytest


@pytest.fixture()
def setUp():
    print("Method Got executed before every TestCase")
    yield
    print("Method got Executed after every TestCase")

@pytest.fixture(scope="module")
def oneTimeSetUp():
    print("Executed only before every Module")
    yield
    print("Executed only after every Module")